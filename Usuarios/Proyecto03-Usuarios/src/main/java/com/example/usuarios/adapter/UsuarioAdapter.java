package com.example.usuarios.adapter;

 
import java.util.List;
import java.util.stream.Collectors;
 
import org.springframework.stereotype.Component;

import com.example.usuarios.model.Usuario;
import com.example.usuarios.response.UsuarioDTO;
 
@Component
public class UsuarioAdapter {
 
    public UsuarioDTO of(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setId(usuario.getId());
        usuarioDTO.setNombre(usuario.getNombre());
        usuarioDTO.setApellido(usuario.getApellido());
        usuarioDTO.setMail(usuario.getMail());
        usuarioDTO.setPassword(usuario.getPassword());
        usuarioDTO.setFechaAlta(usuario.getFechaAlta());
        return usuarioDTO;
    }

    public List<UsuarioDTO> of(List<Usuario> usuarios){
        return usuarios.stream()
                .map(e -> of(e))
                .collect(Collectors.toList());
    }
}