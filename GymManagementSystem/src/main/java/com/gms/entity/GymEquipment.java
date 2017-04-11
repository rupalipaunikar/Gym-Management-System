package com.gms.entity;

import javax.persistence.*;

/**
 * Created by rupalip on 4/7/2017.
 */
@Entity
@Table(name = "gym_equipment")
public class GymEquipment {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    private String category;
    private int quantity;
    @ManyToOne
    private Admin admin;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
