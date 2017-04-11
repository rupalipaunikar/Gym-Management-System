package com.gms.service;

import com.gms.entity.Member;
import com.gms.request.AddMemberRequest;
import com.gms.request.AssignTrainerRequest;

import java.util.List;

/**
 * Created by rupalip on 4/10/2017.
 */
public interface MemberService {

    List<Member> getAllMembers();

    void addMember(AddMemberRequest addMemberRequest);

    void updateMember(Member member);

    void deleteMember(long id);

    Member getMemberById(long id);

    void assignTrainerToMember(AssignTrainerRequest assignTrainerRequest);

    void unassignTrainer(long memberId);
}
