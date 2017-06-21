package ipass.repository;

import ipass.Examen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by joelt on 21-6-2017.
 */
public interface ExamenRepository  extends JpaRepository<Examen, Integer> {
    public List<Examen> findAll();

}
