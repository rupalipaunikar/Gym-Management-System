package com.gms.repository.member;

import com.gms.repository.trainer.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Created by rupalip on 4/11/2017.
 */
@Repository
public class MemberRepositoryImpl implements MemberRepositoryCustom{

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private TrainerRepository trainerRepository;

    @Override
    @Transactional
    public void assignTrainerToMember(long memberId, long trainerId) {
        Query query = entityManager.createQuery("update Member m set m.trainer.id='"+trainerId+"' where m.id='"+memberId+"'");
        query.executeUpdate();
    }

    @Override
    @Transactional
    public void unassignTrainer(long memberId) {
        Query query = entityManager.createQuery("update Member m set m.trainer.id= null where m.id='"+memberId+"'");
        query.executeUpdate();
    }
}
