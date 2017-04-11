package com.gms.service.impl;

import com.gms.entity.MembershipPlan;
import com.gms.repository.membershipplan.MembershipPlanRepository;
import com.gms.request.AddPlanRequest;
import com.gms.service.MembershipPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rupalip on 4/11/2017.
 */
@Service
public class MembershipPlanServiceImpl implements MembershipPlanService {

    @Autowired
    private MembershipPlanRepository membershipPlanRepository;

    @Override
    public List<MembershipPlan> getAllPlans() {
        return membershipPlanRepository.findAll();
    }

    @Override
    public void addMembershipPlan(AddPlanRequest addPlanRequest){
        MembershipPlan plan = new MembershipPlan();
        plan.setName(addPlanRequest.getName());
        plan.setAmount(addPlanRequest.getAmount());
        plan.setDuration(addPlanRequest.getDuration());
        membershipPlanRepository.save(plan);
    }

    @Override
    public MembershipPlan getMembershipPlanById(Integer id){
        return membershipPlanRepository.findOne(id);
    }
}
