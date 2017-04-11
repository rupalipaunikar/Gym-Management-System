package com.gms.request;

import javax.persistence.Column;
import java.util.Date;

/**
 * Created by rupalip on 4/11/2017.
 */
public class GenerateReceiptRequest {

    private int amountPaid;
    private Date purchaseDate;
    private Date creationDate;
    private long receptionistId;
    private long memberId;

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

    public long getReceptionistId() {
        return receptionistId;
    }

    public void setReceptionistId(long receptionistId) {
        this.receptionistId = receptionistId;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }
}
