package com.gms.service.impl;

import com.gms.entity.Member;
import com.gms.entity.Trainer;
import com.gms.repository.trainer.TrainerRepository;
import com.gms.request.AddTrainerRequest;
import com.gms.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rupalip on 4/11/2017.
 */
@Service
public class TrainerServiceImpl implements TrainerService {

    @Autowired
    private TrainerRepository trainerRepository;

    @Override
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

    @Override
    public Trainer getTrainerById(Long id){
        return trainerRepository.findById(id);
    }

    @Override
    public void updateTrainer(Trainer trainer) {
        trainerRepository.save(trainer);
    }

    @Override
    public void deleteTrainer(Long id) {
        trainerRepository.delete(id);
    }

    @Override
    public List<Member> getMembersByTrainerId(long id) {
        Trainer trainer = trainerRepository.findOne(id);
        return trainer.getMembers();
    }
}
