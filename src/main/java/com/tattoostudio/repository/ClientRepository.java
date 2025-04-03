package com.tattoostudio.repository;

import com.tattoostudio.model.Client;
import java.util.List;
import java.util.Optional;

public interface ClientRepository {
    List<Client> findAll();
    Optional<Client> findById(long id);
    Client save(Client client);
    void delete(Long id);
}