package com.gms.repository.receipt;

import com.gms.entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rupalip on 4/11/2017.
 */
@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Integer>{
}
