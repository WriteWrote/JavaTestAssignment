package test.eo.db.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.eo.db.entities.TypeEntity;

@Repository
public interface TypeRepository extends CrudRepository<TypeEntity, Integer> {

}
