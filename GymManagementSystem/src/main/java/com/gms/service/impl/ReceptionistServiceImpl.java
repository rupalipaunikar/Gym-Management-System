package com.gms.service.impl;

import com.gms.entity.Member;
import com.gms.entity.Receipt;
import com.gms.entity.Receptionist;
import com.gms.repository.member.MemberRepository;
import com.gms.repository.receipt.ReceiptRepository;
import com.gms.repository.receptionist.ReceptionistRepository;
import com.gms.request.AddReceptionistRequest;
import com.gms.request.GenerateReceiptRequest;
import com.gms.service.ReceptionistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rupalip on 4/11/2017.
 */
@Service
public class ReceptionistServiceImpl implements ReceptionistService{

    @Autowired
    private ReceptionistRepository receptionistRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private ReceiptRepository receiptRepository;

    @Override
    public void addReceptionist(AddReceptionistRequest addReceptionistRequest){
        Receptionist receptionist = new Receptionist();
        receptionist.setGender(addReceptionistRequest.getGender());
        receptionist.setAddress(addReceptionistRequest.getAddress());
        receptionist.setAge(addReceptionistRequest.getAge());
        receptionist.setName(addReceptionistRequest.getName());
        receptionist.setSalary(addReceptionistRequest.getSalary());
        receptionistRepository.save(receptionist);
    }

    @Override
    public Receptionist getReceptionistById(Long id){
        return receptionistRepository.findOne(id);
    }

    @Override
    public void updateReceptionist(Receptionist receptionist) {
        receptionistRepository.save(receptionist);
    }

    @Override
    public void deleteReceptionist(Long id) {
        receptionistRepository.delete(id);
    }

    @Override
    public void generateReceipt(GenerateReceiptRequest generateReceiptRequest) {
        Member member = memberRepository.findOne(generateReceiptRequest.getMemberId());
        Receptionist receptionist = receptionistRepository.findOne(generateReceiptRequest.getReceptionistId());

        Receipt receipt = new Receipt();
        receipt.setAmountPaid(generateReceiptRequest.getAmountPaid());
        receipt.setCreationDate(generateReceiptRequest.getCreationDate());
        receipt.setPurchaseDate(generateReceiptRequest.getPurchaseDate());
        receipt.setMember(member);
        receipt.setReceptionist(receptionist);

        receiptRepository.save(receipt);
    }
}
