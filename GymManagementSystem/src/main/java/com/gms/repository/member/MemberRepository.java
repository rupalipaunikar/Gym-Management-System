package com.gms.repository.member;

import com.gms.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rupalip on 4/10/2017.
 */
public interface MemberRepository extends JpaRepository<Member, Long>{

    Member findById(Long id);
}
