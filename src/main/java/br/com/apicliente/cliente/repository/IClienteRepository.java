package br.com.apicliente.cliente.repository;

import br.com.apicliente.cliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
}
