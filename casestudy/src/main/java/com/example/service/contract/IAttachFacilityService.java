package com.example.service.contract;

import com.example.model.contract.AttachFacility;
import com.example.service.IGeneralService;

import java.util.List;

public interface IAttachFacilityService extends IGeneralService<AttachFacility> {

    List<AttachFacility> findAll();
}
