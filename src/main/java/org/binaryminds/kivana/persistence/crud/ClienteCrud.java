package org.binaryminds.kivana.persistence.crud;

import org.binaryminds.kivana.persistence.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ClienteCrud  extends JpaRepository<Cliente , Integer> {

    //peude sustituir al DAO
    // esta interfaz tiene todos los metodos genericos del CRUD



}
