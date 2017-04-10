package com.gms.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rupalip on 4/7/2017.
 */
@Entity
@Table(name = "receptionist")
public class Receptionist extends Employee{

    private int salary;

    @OneToMany
    private List<Receipt> receipts = new ArrayList<>();

    public List<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(List<Receipt> receipts) {
        this.receipts = receipts;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
