package com.gms.repository.admin;

import com.gms.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rupalip on 4/7/2017.
 */
public interface AdminRepository extends JpaRepository<Admin, Long>, AdminRepositoryCustom{

    Admin findById(Long id);
}
