package com.gms.controller;

import com.gms.entity.Admin;
import com.gms.entity.MembershipPlan;
import com.gms.request.AddPlanRequest;
import com.gms.service.MembershipPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rupalip on 4/10/2017.
 */
@RestController
public class MembershipPlanController {

    @Autowired
    private MembershipPlanService membershipPlanService;

    @RequestMapping(method = RequestMethod.GET, value = "/plans")
    public List<MembershipPlan> getAllPlans(){
        return membershipPlanService.getAllPlans();
    }

    @RequestMapping(method = RequestMethod.POST, value = "plan/add")
    public void addPlan(@RequestBody AddPlanRequest addPlanRequest){
        membershipPlanService.addMembershipPlan(addPlanRequest);
    }

    @RequestMapping("plan/{id}")
    public MembershipPlan getPlanById(@PathVariable Integer id){
        return membershipPlanService.getMembershipPlanById(id);
    }
}
