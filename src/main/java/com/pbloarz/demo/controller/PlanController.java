package com.pbloarz.demo.controller;


import com.pbloarz.demo.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;


import com.pbloarz.demo.model.Plan;

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
