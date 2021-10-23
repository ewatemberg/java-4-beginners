package ar.edu.utn.frlp.app.controller;

import ar.edu.utn.frlp.app.config.ApiVersion;
import ar.edu.utn.frlp.app.controller.util.PaginationUtil;
import ar.edu.utn.frlp.app.controller.util.ResponseUtil;
import ar.edu.utn.frlp.app.domain.User;
import ar.edu.utn.frlp.app.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    private final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/api/" + ApiVersion.V1 + "/users")
    public ResponseEntity<User> createUser(@RequestBody User user) throws URISyntaxException {
        log.debug("REST request to save User : {}", user);
        User result = userService.save(user);
        return ResponseEntity
                .created(new URI("/api/users/" + result.getId()))
                .body(result);
    }

    @PutMapping("/api/" + ApiVersion.V1 + "/users/{id}")
    public ResponseEntity<User> updateUser(
            @PathVariable(value = "id", required = false) final Long id,
            @RequestBody User user) {
        log.debug("REST request to update User : {}, {}", id, user);
        User result = userService.save(user);
        return ResponseEntity
                .ok()
                .body(result);
    }

    @PatchMapping(value = "/api/" + ApiVersion.V1 + "/users/{id}", consumes = "application/merge-patch+json")
    public ResponseEntity<User> partialUpdateUser(
            @PathVariable(value = "id", required = false) final Long id,
            @RequestBody User user) {
        log.debug("REST request to partial update User partially : {}, {}", id, user);
        Optional<User> result = userService.partialUpdate(user);
        return ResponseUtil.wrapOrNotFound(result, null);
    }

    @GetMapping("/api/" + ApiVersion.V1 + "/users")
    public ResponseEntity<List<User>> getAllUsers(Pageable pageable) {
        log.debug("REST request to get a page of User");
        Page<User> page = userService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    @GetMapping("/api/" + ApiVersion.V1 + "/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        log.debug("REST request to get User : {}", id);
        Optional<User> user = userService.findOne(id);
        return ResponseUtil.wrapOrNotFound(user);
    }

    @DeleteMapping("/api/" + ApiVersion.V1 + "/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        log.debug("REST request to delete User : {}", id);
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
