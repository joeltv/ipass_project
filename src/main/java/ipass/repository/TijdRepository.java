package ipass.repository;

import ipass.Tijd;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by joelt on 21-6-2017.
 */
public interface TijdRepository extends JpaRepository<Tijd, Integer> {
    public List<Tijd> findAll();
}
