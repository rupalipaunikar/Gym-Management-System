package com.gms.service;

import com.gms.entity.BodyMeasurement;
import com.gms.repository.bodymeasurement.BodyMeasurementRepository;
import com.gms.request.BodyMeasurementRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rupalip on 4/10/2017.
 */

public interface BodyMeasurementService {

    void addBodyMeasurement(BodyMeasurementRequest bodyMeasurementRequest);

    BodyMeasurement getBodyMeasurementById(Integer id);
}
