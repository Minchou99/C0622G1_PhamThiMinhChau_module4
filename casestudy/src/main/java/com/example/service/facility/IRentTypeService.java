package com.example.service.facility;

import com.example.model.facility.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRentTypeService{
    List<RentType> findAll();
}
