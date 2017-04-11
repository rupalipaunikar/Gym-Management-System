package com.gms.repository.gymequipment;

import com.gms.entity.GymEquipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rupalip on 4/10/2017.
 */
@Repository
public interface GymEquipmentRepository extends JpaRepository<GymEquipment, Integer>{

    List<GymEquipment> findByAdminId(long id);
}
