package com.project.hethongkhachsan.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "payment_statusesT")
public class PaymentStatusEntity extends BaseEntity{

	@Column
	private String name;

	@OneToMany(mappedBy = "payment_status", cascade = CascadeType.ALL)
	private List<PaymentEntity> payments  = new ArrayList<>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PaymentEntity> getPayments() {
		return payments;
	}

	public void setPayments(List<PaymentEntity> payments) {
		this.payments = payments;
	}
	
}
