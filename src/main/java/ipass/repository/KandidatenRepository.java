package ipass.repository;

import ipass.Kandidaten;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import java.util.List;


@Repository
public interface KandidatenRepository extends JpaRepository<Kandidaten, Integer> {

    @Query(value = "select k from Kandidaten k where k.BSN = :bsn")
    Kandidaten findByBSN(@Param("bsn") Integer BSN);

    public List<Kandidaten> findAll();

}