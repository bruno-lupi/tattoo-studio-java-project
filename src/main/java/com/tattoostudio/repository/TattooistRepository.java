package com.tattoostudio.repository;

import com.tattoostudio.model.Tattooist;
import java.util.List;
import java.util.Optional;

public interface TattooistRepository {
    List<Tattooist> findAll();
    Optional<Tattooist> findById(Long id);
    Tattooist save(Tattooist tattooist);
    void delete(Long id);
}