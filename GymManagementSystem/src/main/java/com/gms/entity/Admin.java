package com.gms.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rupalip on 4/7/2017.
 */
@Entity
@Table(name = "admin")
public class Admin extends Employee {

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY)
    private List<GymEquipment> gymEquipments = new ArrayList<>();

    public List<GymEquipment> getGymEquipments() {
        return gymEquipments;
    }

    public void setGymEquipments(List<GymEquipment> gymEquipments) {
        this.gymEquipments = gymEquipments;
    }
}
