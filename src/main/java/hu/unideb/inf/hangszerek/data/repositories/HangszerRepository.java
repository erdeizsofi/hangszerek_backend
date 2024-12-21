package hu.unideb.inf.hangszerek.data.repositories;

import hu.unideb.inf.hangszerek.data.entities.HangszerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HangszerRepository extends JpaRepository<HangszerEntity, Long> {

    List<HangszerEntity> findAllByTipus(String tipus);

}
