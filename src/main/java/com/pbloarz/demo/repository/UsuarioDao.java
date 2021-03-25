package com.pbloarz.demo.repository;

import com.pbloarz.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDao  extends JpaRepository<Usuario, Integer> {
    public Usuario findByNombre(String nombre);
}
