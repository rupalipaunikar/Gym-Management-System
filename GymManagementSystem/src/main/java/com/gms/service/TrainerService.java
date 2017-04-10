package com.gms.service;

import com.gms.entity.Trainer;
import com.gms.repository.trainer.TrainerRepository;
import com.gms.request.AddTrainerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rupalip on 4/10/2017.
 */
@Service
public class TrainerService {

    @Autowired
    private TrainerRepository trainerRepository;

    public void addTrainer(AddTrainerRequest addTrainerRequest){
        Trainer trainer = new Trainer();
        trainer.setGender(addTrainerRequest.getGender());
        trainer.setAddress(addTrainerRequest.getAddress());
        trainer.setAge(addTrainerRequest.getAge());
        trainer.setName(addTrainerRequest.getName());
        trainer.setHourlyWages(addTrainerRequest.getHourlyWages());
        trainer.setShiftEndTime(addTrainerRequest.getShiftEndTime());
        trainer.setShiftStartTime(addTrainerRequest.getShiftStartTime());
        trainerRepository.save(trainer);
    }

    public Trainer getTrainerById(Long id){
        return trainerRepository.findById(id);
    }
}

