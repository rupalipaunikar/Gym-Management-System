package com.gms.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rupalip on 4/7/2017.
 */
@Entity
@Table(name = "membership_plan")
public class MembershipPlan {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String duration;
    private int amount;

    @OneToMany
    private List<Member> members = new ArrayList<>();

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
