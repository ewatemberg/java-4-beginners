package ar.edu.utn.frlp.app.service;

import ar.edu.utn.frlp.app.domain.ColumnBoard;
import ar.edu.utn.frlp.app.repository.ColumnRepository;
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
public class ColumnBoardService {

    private final Logger log = LoggerFactory.getLogger(ColumnBoardService.class);

    @Autowired
    ColumnRepository columnRepository;

    public ColumnBoard save(ColumnBoard columnBoard) {
        log.debug("Request to save Column : {}", columnBoard);
        return columnRepository.save(columnBoard);
    }

    public Optional<ColumnBoard> partialUpdate(ColumnBoard columnBoard) {
        log.debug("Request to partially update Column : {}", columnBoard);
        Optional<ColumnBoard> existingColumn = columnRepository.findById(columnBoard.getId());
        columnRepository.save(existingColumn.get());
        return existingColumn;
    }

    @Transactional(readOnly = true)
    public Page<ColumnBoard> findAll(Pageable pageable) {
        log.debug("Request to get all Columns");
        return columnRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public Optional<ColumnBoard> findOne(Long id) {
        log.debug("Request to get Column : {}", id);
        return columnRepository.findById(id);
    }

    public void delete(Long id) {
        log.debug("Request to delete Column : {}", id);
        columnRepository.deleteById(id);
    }

}
