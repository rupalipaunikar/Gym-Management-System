package com.gms.repository;

import java.util.List;

import com.gms.entity.Admin;

/**
 * Created by rupalip on 4/7/2017.
 */

public interface AdminRepository {

	List<Admin> getAllAdmins();

	void save(Admin admin);

	void delete(long id);

	Admin findOne(Long id);
}
