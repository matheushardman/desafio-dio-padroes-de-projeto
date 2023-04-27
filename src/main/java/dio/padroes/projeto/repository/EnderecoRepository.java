package dio.padroes.projeto.repository;

import dio.padroes.projeto.model.Endereco;
import org.springframework.data.repository.CrudRepository;

public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
