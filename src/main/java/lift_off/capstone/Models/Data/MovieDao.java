package lift_off.capstone.Models.Data;

import lift_off.capstone.Models.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface MovieDao extends CrudRepository<Movie, Integer> {

}
