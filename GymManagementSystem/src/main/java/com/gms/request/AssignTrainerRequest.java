package com.gms.request;

/**
 * Created by rupalip on 4/11/2017.
 */
public class AssignTrainerRequest {

    private long memberId;
    private long trainerId;

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public long getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(long trainerId) {
        this.trainerId = trainerId;
    }
}
