package dio.padroes.projeto.repository;

import dio.padroes.projeto.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
