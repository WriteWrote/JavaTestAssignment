package test.eo.db.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.eo.db.entities.DocumentEntity;

import javax.validation.constraints.NotNull;

@Repository
public interface DocumentRepository extends CrudRepository<DocumentEntity, Integer>,
        JpaRepository<DocumentEntity, Integer> {
    DocumentEntity findBySerialNumber(@NotNull(message = "document serialNumber cannot be null") Integer serialNumber);
    void deleteBySerialNumber();
    void deleteById();
}
