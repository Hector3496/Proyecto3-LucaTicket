package com.example.usuarios.response;



/**
* @author Raul
*/
import java.io.Serializable;
import java.util.Date;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



/**
* Creamos la entidad UsuarioDTO
* Creamos los atributos de UsuarioDTO con los metodos getter y setters con Lombok
*
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