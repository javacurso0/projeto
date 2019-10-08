package projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import projeto.entity.EMail;

@RepositoryRestResource(path = "emails")
public interface EMailRepository extends JpaRepository<EMail, Long> {
}