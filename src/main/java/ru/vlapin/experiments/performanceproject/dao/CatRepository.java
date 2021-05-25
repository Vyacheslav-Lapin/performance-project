package ru.vlapin.experiments.performanceproject.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.experiments.performanceproject.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
