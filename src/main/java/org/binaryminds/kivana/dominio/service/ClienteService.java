package org.binaryminds.kivana.dominio.service;

import org.binaryminds.kivana.persistence.crud.ClienteCrud;
import org.binaryminds.kivana.persistence.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteService implements IClienteService{

    //inyecciom de dependencias de mi repositorio (ClienteCrud) [ClienteReposotory
    @Autowired
    private ClienteCrud crud ;


    @Override
    public List<Cliente> listarClientes() {
        List <Cliente > cliente = crud.findAll();
        return cliente;

    }

    @Override
    public Cliente buscarClientePorId(Integer codigo) {
        Cliente cliente = crud.findById(codigo).orElse(null);
        return cliente;
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        crud.save(cliente);

    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        crud.delete(cliente);

    }
}
