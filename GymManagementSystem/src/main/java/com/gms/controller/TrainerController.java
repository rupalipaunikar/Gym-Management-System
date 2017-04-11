package com.gms.controller;

import com.gms.entity.Member;
import com.gms.entity.Trainer;
import com.gms.request.AddTrainerRequest;
import com.gms.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping("trainer/members/{trainerId}")
    public List<Member> getMembersByTrainerId(@PathVariable long trainerId){
        return trainerService.getMembersByTrainerId(trainerId);
    }

    @RequestMapping("trainer/{id}")
    public Trainer getTrainerById(@PathVariable Long id){
        return trainerService.getTrainerById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "trainer/update")
    public void updateTrainer(@RequestBody Trainer trainer){
        trainerService.updateTrainer(trainer);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "trainer/{id}")
    public void deleteTrainer(@PathVariable Long id){
        trainerService.deleteTrainer(id);
    }
}
