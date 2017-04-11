package com.gms.controller;

import com.gms.entity.Member;
import com.gms.request.AddMemberRequest;
import com.gms.request.AssignTrainerRequest;
import com.gms.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rupalip on 4/10/2017.
 */
@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(method = RequestMethod.GET, value = "/members")
    public List<Member> getAllMembers(){
        return memberService.getAllMembers();
    }

    @RequestMapping(method = RequestMethod.POST, value = "member/add")
    public void addMember(@RequestBody AddMemberRequest addMemberRequest){
        memberService.addMember(addMemberRequest);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "member/update")
    public void updateMember(@RequestBody Member member){
        memberService.updateMember(member);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "member/delete/{id}")
    public void deleteMember(@PathVariable long id){
        memberService.deleteMember(id);
    }

    @RequestMapping("member/{id}")
    public Member getMemberById(@PathVariable long id){
        return memberService.getMemberById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "member/assignTrainer")
    public String assignTrainer(@RequestBody AssignTrainerRequest assignTrainerRequest){
        memberService.assignTrainerToMember(assignTrainerRequest);
        return "Assigned trainer successfully";
    }

    @RequestMapping(method = RequestMethod.POST, value = "member/unassignTrainer/{memberId}")
    public String unassignTrainer(@PathVariable long memberId){
        memberService.unassignTrainer(memberId);
        return "Trainer unassigned successfully";
    }
}
