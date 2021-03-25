package com.pbloarz.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Communication {

    private Long id;
    @OneToOne(mappedBy = "communication")
    private Client client;
    @OneToOne(mappedBy = "communication")
    private Plan plan;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
