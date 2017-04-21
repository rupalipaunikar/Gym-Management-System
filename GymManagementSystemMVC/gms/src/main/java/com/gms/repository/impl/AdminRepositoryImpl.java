package com.gms.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gms.entity.Admin;
import com.gms.repository.AdminRepository;

@Repository
public class AdminRepositoryImpl implements AdminRepository{

	@Autowired
	private DataSource dataSource;
	
	@Override
	public List<Admin> getAllAdmins() {
		String select_sql = "SELECT * from admin";
		JdbcTemplate jt = new JdbcTemplate(dataSource);
		
		final List<Admin> admins = new ArrayList<Admin>();
		final List<Map<String, Object>> rows = jt.queryForList(select_sql);
		
		for (Map<String, Object> row : rows) {
			Admin admin = new Admin();
			admin.setAddress((String) row.get("address"));
			admin.setAge((Integer) row.get("age"));
			admin.setGender((String) row.get("gender"));
			admin.setName((String) row.get("name"));
			admins.add(admin);
		}
		return admins;
	}

	@Override
	public void save(Admin admin) {
		String insert_sql = "INSERT INTO admin VALUES(?,?,?,?,?)";
		JdbcTemplate jt = new JdbcTemplate(dataSource);
		Object[] params = new Object[]{1,admin.getName(), admin.getAge(), admin.getGender(), admin.getAddress()};
		jt.update(insert_sql, params) ;
		//throw new RuntimeException("simulate Error condition") ;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Admin findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
