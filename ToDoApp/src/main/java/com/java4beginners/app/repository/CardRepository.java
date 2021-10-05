package com.java4beginners.app.repository;

import com.java4beginners.app.model.Card;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class CardRepository {

    private final Logger logger = LoggerFactory.getLogger(CardRepository.class);
    Random random = new Random();
    List<Card> dbMock = new ArrayList<>();

    public CardRepository() {
        loadMockedCardList();
    }

    /* Este metodo simula guardar un objeto en la BD
     * en este caso lo estamos agregando a una lista en memoria
     * y simulando que se le asigna un id de bd.
     * @param newCard
     */
    public Card save(Card newCard) {
        newCard.setId(random.nextLong());
        logger.info("Saving card with id: {}", newCard.getId());
        dbMock.add(newCard);
        return newCard;
    }

    /* Este metodo simula actualizar un objeto en la BD
     * ¿Cómo actuariamos si no se encuentra en la lista?
     */
    public Card update(Card card) {
        /*Implementar lógica que me permita tomar la lista de tarjetas dbMock y actualizar la que corresponda en base a su id.
        Una vez encontrada, deberia retornar la tarjeta actualizada*/
        return null;
    }

    public List<Card> findAll() {
        return dbMock;
    }

    /* Este metodo debe filtrar la lista y obtener la tarjeta correspondiente
     * ¿Como actuariamos si no se encuentra en la lista?
     */
    public Card findById(Long id) {
        //deberia retornar la tarjeta que se busca
        return null;
    }

    /* Este metodo simula traer información de una BD y crea
     * aleatoriamente una lista con 20 objetos.
     */
    private void loadMockedCardList() {
        for (int i = 0; i < 20; i++) {
            dbMock.add(new Card(random.nextLong(), "Titulo Tarjeta " + i));
        }
    }

}
