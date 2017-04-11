package com.gms.service;

import com.gms.entity.Admin;
import com.gms.entity.GymEquipment;
import com.gms.repository.admin.AdminRepository;
import com.gms.repository.gymequipment.GymEquipmentRepository;
import com.gms.request.AddGymEquipmentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rupalip on 4/10/2017.
 */

public interface GymEquipmentService {

    List<GymEquipment> getAllGymEquipments();

    List<GymEquipment> getAllGymEquipmentsByAdmin(long id);

    void addGymEquipment(AddGymEquipmentRequest addGymEquipmentRequest);

    void deleteGymEquipment(int id);

    void updateGymEquipment(GymEquipment gymEquipment);

    GymEquipment getGymEquipmentById(int id);
}
