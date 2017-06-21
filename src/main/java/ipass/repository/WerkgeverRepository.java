package ipass.repository;

import ipass.Kandidaten;
import ipass.Werkgever;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by joelt on 14-6-2017.
 */
@Repository
public interface WerkgeverRepository extends JpaRepository<Werkgever, Integer> {


}

