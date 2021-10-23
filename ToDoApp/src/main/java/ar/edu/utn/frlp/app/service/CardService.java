package ar.edu.utn.frlp.app.service;

import ar.edu.utn.frlp.app.domain.Card;
import ar.edu.utn.frlp.app.repository.CardRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class CardService {

    private final Logger log = LoggerFactory.getLogger(CardService.class);

    @Autowired
    CardRepository cardRepository;

    public Card save(Card card) {
        log.debug("Request to save Card : {}", card);
        return cardRepository.save(card);
    }

    public Optional<Card> partialUpdate(Card card) {
        log.debug("Request to partially update Card : {}", card);
        Optional<Card> existingCard = cardRepository.findById(card.getId());
        cardRepository.save(existingCard.get());
        return existingCard;
    }

    @Transactional(readOnly = true)
    public Page<Card> findAll(Pageable pageable) {
        log.debug("Request to get all Cards");
        return cardRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public Optional<Card> findOne(Long id) {
        log.debug("Request to get Card : {}", id);
        return cardRepository.findById(id);
    }

    public void delete(Long id) {
        log.debug("Request to delete Card : {}", id);
        cardRepository.deleteById(id);
    }

}
