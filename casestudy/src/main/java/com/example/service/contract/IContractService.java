package com.example.service.contract;

import com.example.dto.contract.IContractDto;
import com.example.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IContractService {

    Page<IContractDto> findAllDto(Pageable pageable);

    Optional<Contract> findById(int id);

    void save(Contract contract);

}
