package com.gms.service;

import com.gms.entity.BodyMeasurement;
import com.gms.repository.bodymeasurement.BodyMeasurementRepository;
import com.gms.request.BodyMeasurementRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rupalip on 4/10/2017.
 */
@Service
public class BodyMeasurementService {

    @Autowired
    private BodyMeasurementRepository bodyMeasurementRepository;

    public void addBodyMeasurement(BodyMeasurementRequest bodyMeasurementRequest){
        BodyMeasurement bodyMeasurement = new BodyMeasurement();
        bodyMeasurement.setBicepsInCms(bodyMeasurementRequest.getBicepsInCms());
        bodyMeasurement.setDateOfMeasurement(bodyMeasurementRequest.getDateOfMeasurement());
        bodyMeasurement.setHeightInCms(bodyMeasurementRequest.getHeightInCms());
        bodyMeasurement.setWeightInKgs(bodyMeasurementRequest.getWeightInKgs());
        bodyMeasurementRepository.save(bodyMeasurement);
    }

    public BodyMeasurement getBodyMeasurementById(Integer id){
        return bodyMeasurementRepository.findById(id);
    }
}
