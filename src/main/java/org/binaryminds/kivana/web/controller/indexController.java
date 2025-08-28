package org.binaryminds.kivana.web.controller;

import jakarta.annotation.PostConstruct;
import org.binaryminds.kivana.persistence.entity.Cliente;
import org.binaryminds.kivana.dominio.service.IClienteService;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@ViewScoped
public class indexController {
    @Autowired
    IClienteService clienteService;
    private List<Cliente> clientes;
    private Cliente clienteSeleccionado;
    private static final Logger logger = LoggerFactory.getLogger(indexController.class);

    @PostConstruct
    public void init(){
        cargarDatos();
    }
    public void cargarDatos(){
        this.clientes= this.clienteService.listarClientes();
        this.clientes.forEach(cliente-> logger.info(cliente.toString()));

    }
    public void agregarCliente(){
        this.clienteSeleccionado= new Cliente();
    }

}



