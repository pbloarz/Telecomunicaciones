package com.pbloarz.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.pbloarz.demo.model.Usuario;
import com.pbloarz.demo.service.PlanService;
import com.pbloarz.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pbloarz.demo.model.Plan;
import com.pbloarz.demo.repository.UsuarioDao;
import com.pbloarz.demo.response.RespuestaPersonalizada;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/plan")
public class PlanController{
    
    @Autowired private PlanService planService;
    @PostMapping("/create")
    public ResponseEntity<Object> crearUsuario(@RequestBody Plan plan){
        return planService.create(plan);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Plan plan){
        planService.edit(plan);
    }
    @DeleteMapping("/eliminar/{id}")
    public void delete(@PathVariable("id") Integer id){
        planService.delete(id);
    }
    @GetMapping("/listAll")
    public ResponseEntity<Object> list(){
        return planService.list();
    }
}
