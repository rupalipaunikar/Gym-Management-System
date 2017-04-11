package com.gms.service;

import com.gms.entity.Member;
import com.gms.entity.Trainer;
import com.gms.request.AddTrainerRequest;

import java.util.List;

/**
 * Created by rupalip on 4/10/2017.
 */
public interface TrainerService {

    void addTrainer(AddTrainerRequest addTrainerRequest);

    Trainer getTrainerById(Long id);

    void updateTrainer(Trainer trainer);

    void deleteTrainer(Long id);

    List<Member> getMembersByTrainerId(long id);
}

