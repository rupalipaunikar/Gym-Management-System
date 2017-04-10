package com.gms.controller;

import com.gms.entity.Member;
import com.gms.request.AddMemberRequest;
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

    @RequestMapping(method = RequestMethod.DELETE, value = "member/delete/{id}")
    public void deleteMember(@PathVariable Long id){
        memberService.deleteMember(id);
    }

    @RequestMapping("member/{id}")
    public Member getMemberById(@PathVariable Long id){
        return memberService.getMemberById(id);
    }
}
