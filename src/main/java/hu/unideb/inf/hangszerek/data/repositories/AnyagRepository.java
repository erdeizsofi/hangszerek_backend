package hu.unideb.inf.hangszerek.data.repositories;

import hu.unideb.inf.hangszerek.data.entities.AnyagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnyagRepository extends JpaRepository<AnyagEntity, Long> {
}
