package dio.padroes.projeto.service;

import dio.padroes.projeto.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id);

    void deletar (Long id);
}
