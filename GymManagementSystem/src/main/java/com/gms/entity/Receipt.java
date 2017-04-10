package com.gms.entity;

import javax.persistence.*;

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
    private int purchaseDate;

    @Column(name = "date_of_creation")
    private int creationDate;

    @OneToOne
    private Member member;

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

    public int getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(int purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }
}
