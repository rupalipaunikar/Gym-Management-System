package com.gms.service.impl;

import com.gms.entity.Admin;
import com.gms.repository.admin.AdminRepository;
import com.gms.request.AddAdminRequest;
import com.gms.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rupalip on 4/11/2017.
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    @Override
    public List<Admin> getAllAdmins(){
        return adminRepository.findAll();
    }

    @Override
    public void addAdmin(AddAdminRequest addAdminRequest){
        Admin admin = new Admin();
        admin.setName(addAdminRequest.getName());
        admin.setAddress(addAdminRequest.getAddress());
        admin.setAge(addAdminRequest.getAge());
        admin.setGender(addAdminRequest.getGender());

        adminRepository.save(admin);
    }

    @Override
    public void deleteAdmin(long id){
        adminRepository.delete(id);
    }

    @Override
    public void updateAdmin(Admin admin) {
        adminRepository.save(admin);
    }

    @Override
    public Admin getAdminById(Long id){
        return adminRepository.findById(id);
    }
}
