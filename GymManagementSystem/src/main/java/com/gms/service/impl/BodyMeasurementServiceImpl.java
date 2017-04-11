package com.gms.service.impl;

import com.gms.entity.BodyMeasurement;
import com.gms.entity.Member;
import com.gms.repository.bodymeasurement.BodyMeasurementRepository;
import com.gms.repository.member.MemberRepository;
import com.gms.request.BodyMeasurementRequest;
import com.gms.service.BodyMeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rupalip on 4/11/2017.
 */
@Service
public class BodyMeasurementServiceImpl implements BodyMeasurementService{

    @Autowired
    private BodyMeasurementRepository bodyMeasurementRepository;

    @Autowired
    private MemberRepository memberRepository;

    public void addBodyMeasurement(BodyMeasurementRequest bodyMeasurementRequest){
        BodyMeasurement bodyMeasurement = new BodyMeasurement();
        bodyMeasurement.setBicepsInCms(bodyMeasurementRequest.getBicepsInCms());
        bodyMeasurement.setDateOfMeasurement(bodyMeasurementRequest.getDateOfMeasurement());
        bodyMeasurement.setHeightInCms(bodyMeasurementRequest.getHeightInCms());
        bodyMeasurement.setWeightInKgs(bodyMeasurementRequest.getWeightInKgs());

        Member member = memberRepository.findOne(bodyMeasurementRequest.getMemberId());
        bodyMeasurement.setMember(member);

        bodyMeasurementRepository.save(bodyMeasurement);
    }

    public BodyMeasurement getBodyMeasurementById(Integer id){
        return bodyMeasurementRepository.findById(id);
    }
}
