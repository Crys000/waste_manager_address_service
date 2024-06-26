package com.example.wastemanageraddressapi.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WasteManagerAddressDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id; 
	private String direccion;
	private Boolean isEnabled;

}
