package com.gms.controller;

import com.gms.entity.Receptionist;
import com.gms.request.AddReceptionistRequest;
import com.gms.service.ReceptionistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rupalip on 4/10/2017.
 */
@RestController
public class ReceptionistController {

    @Autowired
    private ReceptionistService receptionistService;

    @RequestMapping(method = RequestMethod.POST, value = "receptionist/add")
    public void addReceptionist(@RequestBody AddReceptionistRequest addReceptionistRequest){
        receptionistService.addReceptionist(addReceptionistRequest);
    }

    @RequestMapping("receptionist/{id}")
    public Receptionist getReceptionistById(@PathVariable Long id){
        return receptionistService.getReceptionistById(id);
    }
}
