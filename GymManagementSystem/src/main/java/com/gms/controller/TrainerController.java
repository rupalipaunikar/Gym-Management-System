package com.gms.controller;

import com.gms.entity.Trainer;
import com.gms.request.AddTrainerRequest;
import com.gms.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rupalip on 4/10/2017.
 */
@RestController
public class TrainerController {

    @Autowired
    private TrainerService trainerService;

    @RequestMapping(method = RequestMethod.POST, value = "trainer/add")
    public void addTrainer(@RequestBody AddTrainerRequest addTrainerRequest){
        trainerService.addTrainer(addTrainerRequest);
    }

    @RequestMapping("trainer/{id}")
    public Trainer getTrainerById(@PathVariable Long id){
        return trainerService.getTrainerById(id);
    }
}
