package org.binaryminds.kivana.persistence.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Clientes")
//lombok    genera los setter y getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode  // codigo de autenticacion de la enteidad
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer codigoCliente;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String genero;
    private Integer edad;



}
