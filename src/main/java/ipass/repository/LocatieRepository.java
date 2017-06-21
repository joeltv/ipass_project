package ipass.repository;

import ipass.Locatie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by joelt on 21-6-2017.
 */
public interface LocatieRepository  extends JpaRepository<Locatie, Integer> {
//        @Query("SELECT DISTINCT LOCATIEID FROM LOCATIE WHERE LOCATIEID NOT IN :locatieid")
//        Locatie findByLocatie_id(@Param("locatieid") Integer Locatie_id);

        public List<Locatie> findAll();

        @Query("SELECT l FROM Locatie l WHERE l.Locatie_id IN (SELECT distinct lo.Locatie_id FROM Locatie lo)")
        public List<Locatie> findUniqueLocations();

}


