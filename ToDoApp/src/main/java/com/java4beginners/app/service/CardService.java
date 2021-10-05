package com.java4beginners.app.service;

import com.java4beginners.app.model.Card;
import com.java4beginners.app.repository.CardRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    private final Logger logger = LoggerFactory.getLogger(CardService.class);

    @Autowired
    private CardRepository cardRepository;

    public Card save(Card newCard) {
        return cardRepository.save(newCard);
    }

    public Card update(Card card) {
        return cardRepository.update(card);
    }

    public List<Card> findAll() {
        return cardRepository.findAll();
    }

    public Card findById(Long id) {
        return cardRepository.findById(id);
    }

}
