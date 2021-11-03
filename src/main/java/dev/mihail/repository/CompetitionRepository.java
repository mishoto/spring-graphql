package dev.mihail.repository;

import dev.mihail.model.Competition;
import org.springframework.data.repository.CrudRepository;

public interface CompetitionRepository extends CrudRepository<Competition, Integer> {
}
