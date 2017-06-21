package ipass.repository;

import ipass.ExamenMoment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by joelt on 21-6-2017.
 */
@Repository
public interface ExamenMomentRepository extends JpaRepository<ExamenMoment, Integer> {


}
