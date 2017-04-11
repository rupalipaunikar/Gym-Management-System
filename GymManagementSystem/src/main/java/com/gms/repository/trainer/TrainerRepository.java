package com.gms.repository.trainer;

import com.gms.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rupalip on 4/10/2017.
 */
@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Long> {
}
