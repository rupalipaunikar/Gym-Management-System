package com.gms.request;

import java.util.Date;

/**
 * Created by rupalip on 4/10/2017.
 */
public class BodyMeasurementRequest {

    private int heightInCms;
    private int weightInKgs;
    private int bicepsInCms;
    private Date dateOfMeasurement;

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
