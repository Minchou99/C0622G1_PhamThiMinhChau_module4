package com.example.service.contract;

import com.example.dto.contract.IContractDto;
import com.example.model.contract.Contract;
import com.example.repository.contract.IContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContractService implements IContractService{
    @Autowired
    private IContractRepository contractRepository;

    @Override
    public Page<IContractDto> findAllDto(Pageable pageable) {
        return contractRepository.findAllDto(pageable);
    }

    @Override
    public Optional<Contract> findById(int id) {

        return contractRepository.findById(id);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }


}
