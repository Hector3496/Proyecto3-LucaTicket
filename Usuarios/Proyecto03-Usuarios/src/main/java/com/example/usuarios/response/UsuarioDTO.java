package com.example.usuarios.response;

/**
* @author Raul
*/

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
* Clase UsuarioDTO para definir Entity UsuarioDTO con atributos
* Metodos Getter, Setter y toString con Lombok
*/

@Getter
@Setter
@ToString
public class UsuarioDTO implements Serializable{    
    
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String nombre;
    private String apellido;
    private String mail;
    private String password;
    private Date fechaAlta;
}