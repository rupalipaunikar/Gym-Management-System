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
@Service
public class GymEquipmentService {

    @Autowired
    GymEquipmentRepository gymEquipmentRepository;

    @Autowired
    AdminRepository adminRepository;

    public List<GymEquipment> getAllGymEquipments(){
        return gymEquipmentRepository.findAll();
    }

    public void addGymEquipment(AddGymEquipmentRequest addGymEquipmentRequest){
        GymEquipment gymEquipment = new GymEquipment();
        gymEquipment.setName(addGymEquipmentRequest.getName());
        gymEquipment.setCategory(addGymEquipmentRequest.getCategory());
        gymEquipment.setDescription(addGymEquipmentRequest.getDescription());
        gymEquipment.setQuantity(addGymEquipmentRequest.getQuantity());

        Admin admin = adminRepository.findOne(addGymEquipmentRequest.getAdminId());
        gymEquipment.setAdmin(admin);

        gymEquipmentRepository.save(gymEquipment);
    }

    public void deleteGymEquipment(int id){
        gymEquipmentRepository.delete(id);
    }

    public GymEquipment getGymEquipmentById(int id){
        return gymEquipmentRepository.findById(id);
    }
}
