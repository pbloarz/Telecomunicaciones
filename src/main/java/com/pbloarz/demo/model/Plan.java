package com.pbloarz.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Plan implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;
    private String code;
    private String name;
    private String characeristies;
    private double price;

    @OneToOne
    @JoinColumn(name="communication_id")
    private Communication communication;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharaceristies() {
        return characeristies;
    }

    public void setCharaceristies(String characeristies) {
        this.characeristies = characeristies;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Communication getCommunication() {
        return communication;
    }

    public void setCommunication(Communication communication) {
        this.communication = communication;
    }


}
