package projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import projeto.entity.Contato;

@RepositoryRestResource(path = "contatos")
public interface ContatoRepository extends JpaRepository<Contato, Long> {
}