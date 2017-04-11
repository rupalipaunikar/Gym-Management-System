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
public interface AdminService {

    List<Admin> getAllAdmins();

    void addAdmin(AddAdminRequest addAdminRequest);

    void deleteAdmin(long id);

    void updateAdmin(Admin admin);

    Admin getAdminById(Long id);
}
