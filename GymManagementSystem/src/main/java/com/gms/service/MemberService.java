package com.gms.service;

import com.gms.entity.Member;
import com.gms.repository.member.MemberRepository;
import com.gms.request.AddMemberRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rupalip on 4/10/2017.
 */
@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllMembers(){
        return memberRepository.findAll();
    }

    public void addMember(AddMemberRequest addMemberRequest){
        Member member = new Member();
        member.setGender(addMemberRequest.getGender());
        member.setAge(addMemberRequest.getAge());
        member.setAddress(addMemberRequest.getAddress());
        member.setName(addMemberRequest.getName());
        member.setContactNo(addMemberRequest.getContactNo());
        member.setDoj(addMemberRequest.getDoj());
        memberRepository.save(member);
    }

    public void deleteMember(long id){
        memberRepository.delete(id);
    }

    public Member getMemberById(Long id){
        return memberRepository.findById(id);
    }
}
