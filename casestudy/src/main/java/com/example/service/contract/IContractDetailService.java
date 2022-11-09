package com.example.service.contract;

import com.example.dto.contract.IContractDetailDto;
import com.example.model.contract.Contract;
import com.example.model.contract.ContractDetail;

import java.util.List;

public interface IContractDetailService {

    List<ContractDetail> findAll();

    List<IContractDetailDto> showAll(Integer id);

    void save(ContractDetail contractDetail);


}
