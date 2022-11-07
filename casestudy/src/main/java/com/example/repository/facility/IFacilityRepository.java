package com.example.repository.facility;

import com.example.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Optional;

public interface IFacilityRepository extends JpaRepository<Facility, Integer> {
    @Query(value = "select * from facility " +
            "where name like %:name% and facility_type_id like %:typeName% and is_delete = 1"
            , nativeQuery = true)
    Page<Facility> findByNameAndFacilityType(@Param("name") String name,
                                             @Param("typeName") String typeName,
                                             Pageable pageable);
    @Query(value = "select * from facility where id=:id and is_delete = 1", nativeQuery = true)
    Optional<Facility> findById(@Param("id") int id);

    @Transactional
    @Modifying
    @Query(value = "update facility set is_delete = 0 where id = :id", nativeQuery = true)
    void remove(@Param("id") int id);


}
