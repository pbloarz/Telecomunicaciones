package com.pbloarz.demo.model;



import javax.persistence.*;

@Entity
public class Communication {

    private int id;


    public void setId(int id) {
        this.id = id;
    }

    @Id
    public int getId() {
        return id;
    }


    private Client cliente;

    @OneToOne(optional = false)
    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    private Plan plan;

    @OneToOne(optional = false)
    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}


