package com.pbloarz.demo.controller;

import com.pbloarz.demo.model.Usuario;
import com.pbloarz.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/user/")
public class UsuarioController {

    @Autowired private UsuarioService usuarioService;

    @PostMapping("/create")
    public ResponseEntity<Object> crearUsuario(@RequestBody Usuario usuario){
        return usuarioService.crear(usuario);
    }
    @PutMapping("/edit")
    public void edit(@RequestBody Usuario user){
        usuarioService.edit(user);
    }
    @DeleteMapping("/eliminar/{id}")
    public void delete(@PathVariable("id") Integer id){
        usuarioService.delete(id);
    }
    @GetMapping("/listAll")
    public ResponseEntity<Object> list(){
       return usuarioService.list();
    }



}
