package com.gms.repository.bodymeasurement;

import com.gms.entity.BodyMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rupalip on 4/10/2017.
 */
@Repository
public interface BodyMeasurementRepository extends JpaRepository<BodyMeasurement, Integer> {
}
