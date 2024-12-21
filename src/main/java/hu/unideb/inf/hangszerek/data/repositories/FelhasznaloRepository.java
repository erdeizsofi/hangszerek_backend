package hu.unideb.inf.hangszerek.data.repositories;

import hu.unideb.inf.hangszerek.data.entities.FelhasznaloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FelhasznaloRepository extends JpaRepository<FelhasznaloEntity, Long> {
    //select * from felhasznalo where email = ?email
    FelhasznaloEntity findByEmail(String email);
}
