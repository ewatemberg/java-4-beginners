package com.java4beginners.app.controller;

import com.java4beginners.app.model.Card;
import com.java4beginners.app.service.CardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CardController {

    private final Logger logger = LoggerFactory.getLogger(CardController.class);

    @Autowired
    CardService cardService;

    @GetMapping("/cards")
    public ResponseEntity<List<Card>> getAllCards(SpringDataWebProperties.Pageable pageable) {
        logger.info("REST request to get a page of Cards");
        List<Card> allCards = cardService.findAll();
        return ResponseEntity.ok().body(allCards);
    }


}
