package ma.xproce.ds_graphql.dao.repositories;

import ma.xproce.ds_graphql.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer,Long> {

     public List<Computer> findByProce(String proce);

}
