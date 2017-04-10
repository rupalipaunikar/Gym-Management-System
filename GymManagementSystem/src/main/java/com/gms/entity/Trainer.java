package com.gms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rupalip on 4/7/2017.
 */
@Entity
@Table(name = "trainer")
public class Trainer extends Employee {

    @Column(name = "shift_start_time")
    private Time shiftStartTime;

    @Column(name = "shift_end_time")
    private Time shiftEndTime;

    @Column(name = "hourly_wages")
    private int hourlyWages;

    @OneToMany
    private List<Member> members = new ArrayList<>();

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Time getShiftStartTime() {
        return shiftStartTime;
    }

    public void setShiftStartTime(Time shiftStartTime) {
        this.shiftStartTime = shiftStartTime;
    }

    public Time getShiftEndTime() {
        return shiftEndTime;
    }

    public void setShiftEndTime(Time shiftEndTime) {
        this.shiftEndTime = shiftEndTime;
    }

    public int getHourlyWages() {
        return hourlyWages;
    }

    public void setHourlyWages(int hourlyWages) {
        this.hourlyWages = hourlyWages;
    }
}

