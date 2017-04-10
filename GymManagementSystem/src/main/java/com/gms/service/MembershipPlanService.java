package com.gms.service;

import com.gms.entity.MembershipPlan;
import com.gms.repository.trainer.membershipplan.MembershipPlanRespository;
import com.gms.request.AddPlanRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rupalip on 4/10/2017.
 */
@Service
public class MembershipPlanService {

    @Autowired
    private MembershipPlanRespository membershipPlanRespository;

    public void addMembershipPlan(AddPlanRequest addPlanRequest){
        MembershipPlan plan = new MembershipPlan();
        plan.setName(addPlanRequest.getName());
        plan.setAmount(addPlanRequest.getAmount());
        plan.setDuration(addPlanRequest.getDuration());
        membershipPlanRespository.save(plan);
    }

    public MembershipPlan getMembershipPlanById(Long id){
        return membershipPlanRespository.findById(id);
    }
}
