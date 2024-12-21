package hu.unideb.inf.hangszerek.data.repositories;

import hu.unideb.inf.hangszerek.data.entities.EladoHangszerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EladoHangszerRepository extends JpaRepository<EladoHangszerEntity, Long> {
}
