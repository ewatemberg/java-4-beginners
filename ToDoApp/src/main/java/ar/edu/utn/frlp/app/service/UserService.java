package ar.edu.utn.frlp.app.service;

import ar.edu.utn.frlp.app.domain.User;
import ar.edu.utn.frlp.app.repository.UserRepository;
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
public class UserService {

    private final Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserRepository userRepository;

    public User save(User user) {
        log.debug("Request to save User : {}", user);
        return userRepository.save(user);
    }

    public Optional<User> partialUpdate(User user) {
        log.debug("Request to partially update User : {}", user);
        Optional<User> existingUser = userRepository.findById(user.getId());
        userRepository.save(existingUser.get());
        return existingUser;
    }

    @Transactional(readOnly = true)
    public Page<User> findAll(Pageable pageable) {
        log.debug("Request to get all Users");
        return userRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public Optional<User> findOne(Long id) {
        log.debug("Request to get User : {}", id);
        return userRepository.findById(id);
    }

    public void delete(Long id) {
        log.debug("Request to delete User : {}", id);
        userRepository.deleteById(id);
    }

}
