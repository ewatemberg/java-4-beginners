package ar.edu.utn.frlp.app.controller;

import ar.edu.utn.frlp.app.config.ApiVersion;
import ar.edu.utn.frlp.app.controller.util.PaginationUtil;
import ar.edu.utn.frlp.app.controller.util.ResponseUtil;
import ar.edu.utn.frlp.app.domain.Board;
import ar.edu.utn.frlp.app.service.BoardService;
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
public class BoardController {

    private final Logger log = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    private BoardService boardService;

    @PostMapping("/api/" + ApiVersion.V1 + "/boards")
    public ResponseEntity<Board> createBoard(@RequestBody Board board) throws URISyntaxException {
        log.debug("REST request to save Board : {}", board);
        Board result = boardService.save(board);
        return ResponseEntity
                .created(new URI("/api/board/" + result.getId()))
                .body(result);
    }

    @PutMapping("/api/" + ApiVersion.V1 + "/boards/{id}")
    public ResponseEntity<Board> updateBoard(
            @PathVariable(value = "id", required = false) final Long id,
            @RequestBody Board board) {
        log.debug("REST request to update Board : {}, {}", id, board);
        Board result = boardService.save(board);
        return ResponseEntity
                .ok()
                .body(result);
    }

    @PatchMapping(value = "/api/" + ApiVersion.V1 + "/boards/{id}", consumes = "application/merge-patch+json")
    public ResponseEntity<Board> partialUpdateBoard(
            @PathVariable(value = "id", required = false) final Long id,
            @RequestBody Board board) {
        log.debug("REST request to partial update Board partially : {}, {}", id, board);
        Optional<Board> result = boardService.partialUpdate(board);
        return ResponseUtil.wrapOrNotFound(result, null);
    }

    @GetMapping("/api/" + ApiVersion.V1 + "/boards")
    public ResponseEntity<List<Board>> getAllBoards(Pageable pageable) {
        log.debug("REST request to get a page of Board");
        Page<Board> page = boardService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    @GetMapping("/api/" + ApiVersion.V1 + "/boards/{id}")
    public ResponseEntity<Board> getBoard(@PathVariable Long id) {
        log.debug("REST request to get Board : {}", id);
        Optional<Board> board = boardService.findOne(id);
        return ResponseUtil.wrapOrNotFound(board);
    }

    @DeleteMapping("/api/" + ApiVersion.V1 + "/boards/{id}")
    public ResponseEntity<Void> deleteBoard(@PathVariable Long id) {
        log.debug("REST request to delete Board : {}", id);
        boardService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
