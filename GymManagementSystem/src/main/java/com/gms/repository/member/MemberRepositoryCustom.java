package com.gms.repository.member;

import org.springframework.stereotype.Repository;

/**
 * Created by rupalip on 4/11/2017.
 */
@Repository
public interface MemberRepositoryCustom {

    void assignTrainerToMember(long memberId, long trainerId);

    void unassignTrainer(long memberId);
}
