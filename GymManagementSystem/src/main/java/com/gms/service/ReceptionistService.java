package com.gms.service;

import com.gms.entity.Receptionist;
import com.gms.repository.receptionist.ReceptionistRepository;
import com.gms.request.AddReceptionistRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rupalip on 4/10/2017.
 */
@Service
public class ReceptionistService {

    @Autowired
    private ReceptionistRepository receptionistRepository;

    public void addReceptionist(AddReceptionistRequest addReceptionistRequest){
        Receptionist receptionist = new Receptionist();
        receptionist.setGender(addReceptionistRequest.getGender());
        receptionist.setAddress(addReceptionistRequest.getAddress());
        receptionist.setAge(addReceptionistRequest.getAge());
        receptionist.setName(addReceptionistRequest.getName());
        receptionist.setSalary(addReceptionistRequest.getSalary());
        receptionistRepository.save(receptionist);
    }

    public Receptionist getReceptionistById(Long id){
        return receptionistRepository.findById(id);
    }
}
