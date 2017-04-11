package com.gms.repository.membershipplan;

import com.gms.entity.MembershipPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rupalip on 4/10/2017.
 */
@Repository
public interface MembershipPlanRepository extends JpaRepository<MembershipPlan, Integer>{
}
