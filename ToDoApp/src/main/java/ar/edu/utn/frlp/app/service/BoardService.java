package ar.edu.utn.frlp.app.service;

import ar.edu.utn.frlp.app.domain.Board;
import ar.edu.utn.frlp.app.repository.BoardRepository;
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
public class BoardService {

    private final Logger log = LoggerFactory.getLogger(BoardService.class);

    @Autowired
    BoardRepository boardRepository;

    public Board save(Board board) {
        log.debug("Request to save Board : {}", board);
        return boardRepository.save(board);
    }

    public Optional<Board> partialUpdate(Board board) {
        log.debug("Request to partially update Board : {}", board);
        Optional<Board> existingBoard = boardRepository.findById(board.getId());
        boardRepository.save(existingBoard.get());
        return existingBoard;
    }

    @Transactional(readOnly = true)
    public Page<Board> findAll(Pageable pageable) {
        log.debug("Request to get all Boards");
        return boardRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public Optional<Board> findOne(Long id) {
        log.debug("Request to get Board : {}", id);
        return boardRepository.findById(id);
    }

    public void delete(Long id) {
        log.debug("Request to delete Board : {}", id);
        boardRepository.deleteById(id);
    }

}
