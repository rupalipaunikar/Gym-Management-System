package com.gms.service;

import java.util.List;

import com.gms.entity.Admin;
import com.gms.request.AddAdminRequest;

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
