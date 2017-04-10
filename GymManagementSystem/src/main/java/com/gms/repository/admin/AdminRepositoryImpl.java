package com.gms.repository.admin;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by rupalip on 4/7/2017.
 */
@Repository
public class AdminRepositoryImpl {

    @PersistenceContext
    EntityManager entityManager;
}
