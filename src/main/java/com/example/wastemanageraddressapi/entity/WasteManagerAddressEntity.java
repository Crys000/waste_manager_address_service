package com.example.wastemanageraddressapi.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="Waste_Manager_Address")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WasteManagerAddressEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String direccion;
	private Boolean isEnabled = Boolean.TRUE;
	private Long version = 0L;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable = false)
	private Date createdDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDate;

	@PrePersist
	protected void onCreate() {
		this.createdDate = (this.createdDate == null) ? new Date() : this.createdDate;
		this.lastModifiedDate = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.lastModifiedDate = new Date();
	}
}
