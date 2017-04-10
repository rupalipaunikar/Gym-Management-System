package com.gms.repository.trainer.membershipplan;

import com.gms.entity.MembershipPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rupalip on 4/10/2017.
 */
@Repository
public interface MembershipPlanRespository extends JpaRepository<MembershipPlan, Long>{

    MembershipPlan findById(Long id);
}
