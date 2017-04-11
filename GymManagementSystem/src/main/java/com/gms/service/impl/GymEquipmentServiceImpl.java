package com.gms.service.impl;

import com.gms.entity.Admin;
import com.gms.entity.GymEquipment;
import com.gms.repository.admin.AdminRepository;
import com.gms.repository.gymequipment.GymEquipmentRepository;
import com.gms.request.AddGymEquipmentRequest;
import com.gms.service.GymEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rupalip on 4/11/2017.
 */
@Service
public class GymEquipmentServiceImpl implements GymEquipmentService{

    @Autowired
    GymEquipmentRepository gymEquipmentRepository;

    @Autowired
    AdminRepository adminRepository;

    @Override
    public List<GymEquipment> getAllGymEquipments(){
        return gymEquipmentRepository.findAll();
    }

    @Override
    public List<GymEquipment> getAllGymEquipmentsByAdmin(long id) {
        return gymEquipmentRepository.findByAdminId(id);
    }

    @Override
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

    @Override
    public void deleteGymEquipment(int id){
        gymEquipmentRepository.delete(id);
    }

    @Override
    public void updateGymEquipment(GymEquipment gymEquipment) {
        gymEquipmentRepository.save(gymEquipment);
    }

    @Override
    public GymEquipment getGymEquipmentById(int id){
        return gymEquipmentRepository.findOne(id);
    }
}

