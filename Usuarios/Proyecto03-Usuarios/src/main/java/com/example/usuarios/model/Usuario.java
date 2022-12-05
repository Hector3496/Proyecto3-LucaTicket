package com.example.usuarios.model;
 
import java.util.Date;
 
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
 
/*
 * Clase Usuario para definir Entity Usuario con atributos
 * Metodos Getter, Setter y toString con Lombok
 */

@Getter
@Setter
@ToString
 
@Entity
@Table(name="usuarios")
public class Usuario {

    private int id;
    @NotEmpty(message = "Introduzca un nombre")
    private String nombre;
    @NotEmpty(message = "El apellido no puede estar vacío")
    private String apellido;
    @NotEmpty(message = "El mail no puede estar vacío")
    private String mail;
    @NotEmpty(message = "La password no puede estar vacía")
    private String password;
    private Date fechaAlta;

    public Usuario() {
        super();
    }
}