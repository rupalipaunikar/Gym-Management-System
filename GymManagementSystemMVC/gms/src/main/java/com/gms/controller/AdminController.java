package com.gms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gms.entity.Admin;
import com.gms.request.AddAdminRequest;
import com.gms.service.AdminService;

/**
 * Created by rupalip on 4/7/2017.
 */
@Controller
public class AdminController {

	@Autowired
    private AdminService adminService;

	
	@RequestMapping("/admins")
    public ModelAndView getAllAdmins() throws Exception{
    	List<Admin> admins = adminService.getAllAdmins();
    	
    	ModelAndView mv = new ModelAndView("admins");
    	mv.addObject("admins",admins);
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST, value = "admin/add")
    public ModelAndView addAdmin(@ModelAttribute AddAdminRequest addAdminRequest){
        adminService.addAdmin(addAdminRequest);
        return new ModelAndView("add");
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "admin/{id}")
    public void deleteAdmin(@PathVariable Long id){
        adminService.deleteAdmin(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "admin/update")
    public void updateAdmin(@RequestBody Admin admin){
        adminService.updateAdmin(admin);
    }
    @RequestMapping("admin/{id}")
    public Admin getAdminById(@PathVariable Long id){
        return adminService.getAdminById(id);
    }

}
