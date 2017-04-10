package com.gms.controller;

import com.gms.entity.BodyMeasurement;
import com.gms.request.BodyMeasurementRequest;
import com.gms.service.BodyMeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rupalip on 4/10/2017.
 */
@RestController
public class BodyMeasurementController {

    @Autowired
    private BodyMeasurementService bodyMeasurementService;

    @RequestMapping(method = RequestMethod.POST, value = "bodymeasurement/add")
    public void addBodyMeasurement(@RequestBody BodyMeasurementRequest bodyMeasurementRequest){
        bodyMeasurementService.addBodyMeasurement(bodyMeasurementRequest);
    }

    @RequestMapping("bodymeasurement/{id}")
    public BodyMeasurement getBodyMeasurementById(@PathVariable Integer id){
        return bodyMeasurementService.getBodyMeasurementById(id);
    }
}
