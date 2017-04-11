package com.gms.service;

import com.gms.entity.MembershipPlan;
import com.gms.request.AddPlanRequest;

import java.util.List;

/**
 * Created by rupalip on 4/10/2017.
 */
public interface MembershipPlanService {

    List<MembershipPlan> getAllPlans();

    void addMembershipPlan(AddPlanRequest addPlanRequest);

    MembershipPlan getMembershipPlanById(Integer id);
}
