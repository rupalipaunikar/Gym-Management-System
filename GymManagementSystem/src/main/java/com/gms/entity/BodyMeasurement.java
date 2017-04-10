package com.gms.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by rupalip on 4/7/2017.
 */
@Entity
@Table(name = "body_measurement")
public class BodyMeasurement {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "height_in_cms")
    private int heightInCms;

    @Column(name = "weight_in_kgs")
    private int weightInKgs;

    @Column(name = "biceps_in_cms")
    private int bicepsInCms;

    @Column(name = "date_of_measurement")
    private Date dateOfMeasurement;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHeightInCms() {
        return heightInCms;
    }

    public void setHeightInCms(int heightInCms) {
        this.heightInCms = heightInCms;
    }

    public int getWeightInKgs() {
        return weightInKgs;
    }

    public void setWeightInKgs(int weightInKgs) {
        this.weightInKgs = weightInKgs;
    }

    public int getBicepsInCms() {
        return bicepsInCms;
    }

    public void setBicepsInCms(int bicepsInCms) {
        this.bicepsInCms = bicepsInCms;
    }

    public Date getDateOfMeasurement() {
        return dateOfMeasurement;
    }

    public void setDateOfMeasurement(Date dateOfMeasurement) {
        this.dateOfMeasurement = dateOfMeasurement;
    }
}
