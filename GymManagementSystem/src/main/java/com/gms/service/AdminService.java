package com.gms.service;

import com.gms.entity.Admin;
import com.gms.repository.admin.AdminRepository;
import com.gms.request.AddAdminRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rupalip on 4/10/2017.
 */
@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public List<Admin> getAllAdmins(){
        return adminRepository.findAll();
    }

    public void addAdmin(AddAdminRequest addAdminRequest){
        Admin admin = new Admin();
        admin.setName(addAdminRequest.getName());
        admin.setAddress(addAdminRequest.getAddress());
        admin.setAge(addAdminRequest.getAge());
        admin.setGender(addAdminRequest.getGender());

        adminRepository.save(admin);
    }

    public void deleteAdmin(long id){
        adminRepository.delete(id);
    }

    public Admin getAdminById(Long id){
        return adminRepository.findById(id);
    }
}
