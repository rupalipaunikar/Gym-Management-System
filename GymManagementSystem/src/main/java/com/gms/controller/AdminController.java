package com.gms.controller;

import com.gms.entity.Admin;
import com.gms.repository.admin.AdminRepository;
import com.gms.request.AddAdminRequest;
import com.gms.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rupalip on 4/7/2017.
 */
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(method = RequestMethod.GET, value = "/admins")
    public List<Admin> getAllAdmins(){
        return adminService.getAllAdmins();
    }

    @RequestMapping(method = RequestMethod.POST, value = "admin/add")
    public void addAdmin(@RequestBody AddAdminRequest addAdminRequest){
        adminService.addAdmin(addAdminRequest);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "admin/delete/{id}")
    public void deleteAdmin(@PathVariable Long id){
        adminService.deleteAdmin(id);
    }

    @RequestMapping("admin/{id}")
    public Admin getAdminById(@PathVariable Long id){
        return adminService.getAdminById(id);
    }

}
