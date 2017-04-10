package com.gms.repository.receptionist;

import com.gms.entity.Receptionist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jca.cci.core.InteractionCallback;
import org.springframework.stereotype.Repository;

/**
 * Created by rupalip on 4/10/2017.
 */
@Repository
public interface ReceptionistRepository extends JpaRepository<Receptionist, Long> {

    Receptionist findById(Long id);
}
