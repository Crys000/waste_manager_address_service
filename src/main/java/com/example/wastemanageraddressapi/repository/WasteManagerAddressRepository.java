package com.example.wastemanageraddressapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.wastemanageraddressapi.entity.WasteManagerAddressEntity;

@Repository
public interface WasteManagerAddressRepository extends JpaRepository<WasteManagerAddressEntity, Long> {

}
