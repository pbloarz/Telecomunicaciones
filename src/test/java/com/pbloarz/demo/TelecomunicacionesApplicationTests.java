package com.pbloarz.demo;

import com.pbloarz.demo.model.Usuario;
import com.pbloarz.demo.repository.UsuarioDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class TelecomunicacionesApplicationTests {


    @Autowired
    private UsuarioDao dao;
    @Autowired
    BCryptPasswordEncoder passwordEncoder;



    @Test
    void crearUsuarioTest() {
        Usuario us = new Usuario();
        us.setNombre("romerome");
        us.setId(3);
        us.setClave(passwordEncoder.encode("1234"));
        Usuario retorno = dao.save(us);
        assert (retorno.getClave().equalsIgnoreCase(us.getClave()));
    }

}
