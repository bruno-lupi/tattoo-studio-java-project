package com.tattoostudio.repository;

import com.tattoostudio.model.Scheduling;
import java.util.List;
import java.util.Optional;

public interface SchedulingRepository {
    List<Scheduling> findAll();
    Optional<Scheduling> findById(Long id);
    Scheduling save(Scheduling scheduling);
    void delete(Long id);
}