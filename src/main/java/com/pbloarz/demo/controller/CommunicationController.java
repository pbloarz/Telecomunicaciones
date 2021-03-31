package com.pbloarz.demo.controller;

import com.pbloarz.demo.model.Communication;
import com.pbloarz.demo.service.CommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/comunication")
public class CommunicationController {
    @Autowired private CommunicationService communicationService;
    @PostMapping("/create")
    public ResponseEntity<Object> create(Communication communication){
       return communicationService.create(communication);
    }
    @PutMapping("/edit")
    public void edit(@RequestBody Communication communication){
        communicationService.edit(communication);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        communicationService.delete(id);
    }
    @GetMapping("/listAll")
    public ResponseEntity<Object> list(){
        return communicationService.list();
    }
}
