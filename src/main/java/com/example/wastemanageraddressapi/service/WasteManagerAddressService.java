package com.example.wastemanageraddressapi.service;

import java.util.List;

import com.example.wastemanageraddressapi.entity.WasteManagerAddressEntity;

public interface WasteManagerAddressService {

	void create(WasteManagerAddressEntity wasteManagerAddress);
	void update(WasteManagerAddressEntity wasteManagerAddress);
	WasteManagerAddressEntity findById(Long id);
	void delete(Long id);
	List<WasteManagerAddressEntity> listAll();
}
