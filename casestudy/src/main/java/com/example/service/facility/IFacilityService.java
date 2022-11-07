package com.example.service.facility;

import com.example.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IFacilityService {
    List<Facility> findAll();

    Page<Facility> findByNameAndFacilityType(String name,
                                             String typeName,
                                             Pageable pageable);

    Optional<Facility> findById(int id);

    void save(Facility facility);

}
