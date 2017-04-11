package com.gms.controller;

import com.gms.entity.Receptionist;
import com.gms.request.AddReceptionistRequest;
import com.gms.request.GenerateReceiptRequest;
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

    @RequestMapping(method = RequestMethod.PUT, value = "receptionist/update")
    public void updateReceptionist(@RequestBody Receptionist receptionist){
        receptionistService.updateReceptionist(receptionist);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "receptionist/{id}")
    public void deleteReceptionist(@PathVariable Long id){
        receptionistService.deleteReceptionist(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "receptionist/generatereceipt")
    public String generateReceipt(@RequestBody GenerateReceiptRequest generateReceiptRequest){
        receptionistService.generateReceipt(generateReceiptRequest);
        return "Receipt generated successfully";
    }
}
