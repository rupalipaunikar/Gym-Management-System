package com.gms.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by rupalip on 4/7/2017.
 */
@Entity
@Table(name = "receipt")
public class Receipt {

    @Id
    @GeneratedValue
    @Column(name = "receipt_no")
    private int receiptNo;

    @Column(name = "amount_paid")
    private int amountPaid;

    @Column(name = "date_of_purchase")
    private Date purchaseDate;

    @Column(name = "date_of_creation")
    private Date creationDate;

    @OneToOne
    private Member member;

    @ManyToOne
    private Receptionist receptionist;

    @JsonIgnore
    public Receptionist getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Receptionist receptionist) {
        this.receptionist = receptionist;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public int getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(int receiptNo) {
        this.receiptNo = receiptNo;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
