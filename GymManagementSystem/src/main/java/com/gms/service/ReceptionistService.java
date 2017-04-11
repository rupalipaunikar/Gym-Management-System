package com.gms.service;

import com.gms.entity.Receptionist;
import com.gms.repository.receptionist.ReceptionistRepository;
import com.gms.request.AddReceptionistRequest;
import com.gms.request.GenerateReceiptRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rupalip on 4/10/2017.
 */
public interface ReceptionistService {

    void addReceptionist(AddReceptionistRequest addReceptionistRequest);

    Receptionist getReceptionistById(Long id);

    void updateReceptionist(Receptionist receptionist);

    void deleteReceptionist(Long id);

    void generateReceipt(GenerateReceiptRequest generateReceiptRequest);
}
