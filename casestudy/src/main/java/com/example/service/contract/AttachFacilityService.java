package com.example.service.contract;

import com.example.model.contract.AttachFacility;
import com.example.repository.contract.IAttachFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class AttachFacilityService implements IAttachFacilityService{


    @Autowired
    private IAttachFacilityRepository attachFacilityRepository;

    @Override
    public List<AttachFacility> findAll() {
        return attachFacilityRepository.findAll();
    }

    @Override
    public Optional<AttachFacility> findById(Integer id) {
        return attachFacilityRepository.findById(id);
    }

    @Override
    public AttachFacility save(AttachFacility attachFacility) {
        return null;
    }

    @Override
    public void remove(Integer id) {

    }

}
