package com.gms.controller;

import com.gms.entity.GymEquipment;
import com.gms.request.AddGymEquipmentRequest;
import com.gms.service.GymEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rupalip on 4/10/2017.
 */
@RestController
public class GymEquipmentController {

    @Autowired
    private GymEquipmentService gymEquipmentService;

    @RequestMapping(method = RequestMethod.GET, value = "/gymEquipments")
    public List<GymEquipment> getAllGymEquipments(){
        return gymEquipmentService.getAllGymEquipments();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/gymEquipments/admin/{id}")
    public List<GymEquipment> getAllGymEquipmentsByAdmin(@PathVariable long id){
        return gymEquipmentService.getAllGymEquipmentsByAdmin(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "gymEquipment/add")
    public void addGymEquipment(@RequestBody AddGymEquipmentRequest addGymEquipmentRequest){
        gymEquipmentService.addGymEquipment(addGymEquipmentRequest);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "gymEquipment/delete/{id}")
    public void deleteGymEquipment(@PathVariable Integer id){
        gymEquipmentService.deleteGymEquipment(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "gymEquipment/update")
    public void updateGymEquipment(@RequestBody GymEquipment gymEquipment){
        gymEquipmentService.updateGymEquipment(gymEquipment);
    }

    @RequestMapping("gymEquipment/{id}")
    public GymEquipment getGymEquipmentById(@PathVariable Integer id){
        return gymEquipmentService.getGymEquipmentById(id);
    }
}
