package ar.edu.utn.frlp.app.controller;

import ar.edu.utn.frlp.app.config.ApiVersion;
import ar.edu.utn.frlp.app.controller.util.PaginationUtil;
import ar.edu.utn.frlp.app.controller.util.ResponseUtil;
import ar.edu.utn.frlp.app.domain.Card;
import ar.edu.utn.frlp.app.service.CardService;
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
public class CardController {

    private final Logger log = LoggerFactory.getLogger(CardController.class);

    @Autowired
    private CardService cardService;

    @PostMapping("/api/" + ApiVersion.V1 + "/cards")
    public ResponseEntity<Card> createCard(@RequestBody Card card) throws URISyntaxException {
        log.debug("REST request to save Card : {}", card);
        Card result = cardService.save(card);
        return ResponseEntity
                .created(new URI("/api/cards/" + result.getId()))
                .body(result);
    }

    @PutMapping("/api/" + ApiVersion.V1 + "/cards/{id}")
    public ResponseEntity<Card> updateCard(
            @PathVariable(value = "id", required = false) final Long id,
            @RequestBody Card card) {
        log.debug("REST request to update Card : {}, {}", id, card);
        Card result = cardService.save(card);
        return ResponseEntity
                .ok()
                .body(result);
    }

    @PatchMapping(value = "/api/" + ApiVersion.V1 + "/cards/{id}", consumes = "application/merge-patch+json")
    public ResponseEntity<Card> partialUpdateCard(
            @PathVariable(value = "id", required = false) final Long id,
            @RequestBody Card card) {
        log.debug("REST request to partial update Card partially : {}, {}", id, card);
        Optional<Card> result = cardService.partialUpdate(card);
        return ResponseUtil.wrapOrNotFound(result, null);
    }

    @GetMapping("/api/" + ApiVersion.V1 + "/cards")
    public ResponseEntity<List<Card>> getAllCards(Pageable pageable) {
        log.debug("REST request to get a page of Card");
        Page<Card> page = cardService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    @GetMapping("/api/" + ApiVersion.V1 + "/cards/{id}")
    public ResponseEntity<Card> getCard(@PathVariable Long id) {
        log.debug("REST request to get Card : {}", id);
        Optional<Card> card = cardService.findOne(id);
        return ResponseUtil.wrapOrNotFound(card);
    }

    @DeleteMapping("/api/" + ApiVersion.V1 + "/cards/{id}")
    public ResponseEntity<Void> deleteCard(@PathVariable Long id) {
        log.debug("REST request to delete Card : {}", id);
        cardService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
