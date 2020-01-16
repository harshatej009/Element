package harsh.rane.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import harsh.rane.model.Element;

@Repository
public interface ElementRepositoryInt extends CrudRepository<Element, Long>{

}
