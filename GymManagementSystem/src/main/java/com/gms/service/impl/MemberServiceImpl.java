package com.gms.service.impl;

import com.gms.entity.Member;
import com.gms.entity.MembershipPlan;
import com.gms.repository.member.MemberRepository;
import com.gms.repository.membershipplan.MembershipPlanRepository;
import com.gms.request.AddMemberRequest;
import com.gms.request.AssignTrainerRequest;
import com.gms.service.MemberService;
import com.gms.service.MembershipPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rupalip on 4/11/2017.
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MembershipPlanRepository membershipPlanRepository;

    @Override
    public List<Member> getAllMembers(){
        return memberRepository.findAll();
    }

    @Override
    public void addMember(AddMemberRequest addMemberRequest){
        Member member = new Member();
        member.setGender(addMemberRequest.getGender());
        member.setAge(addMemberRequest.getAge());
        member.setAddress(addMemberRequest.getAddress());
        member.setName(addMemberRequest.getName());
        member.setContactNo(addMemberRequest.getContactNo());
        member.setDoj(addMemberRequest.getDoj());

        MembershipPlan plan = membershipPlanRepository.findOne(addMemberRequest.getPlanId());
        member.setMembershipPlan(plan);

        memberRepository.save(member);
    }

    @Override
    public void updateMember(Member member) {
        memberRepository.save(member);
    }

    @Override
    public void deleteMember(long id){
        memberRepository.delete(id);
    }

    @Override
    public Member getMemberById(long id) {
        return memberRepository.findOne(id);
    }

    @Override
    public void assignTrainerToMember(AssignTrainerRequest assignTrainerRequest) {
        memberRepository.assignTrainerToMember(assignTrainerRequest.getMemberId(), assignTrainerRequest.getTrainerId());
    }

    @Override
    public void unassignTrainer(long memberId) {
        memberRepository.unassignTrainer(memberId);
    }
}
