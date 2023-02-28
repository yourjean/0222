package com.study.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
@Entity
public class Product {

	@Id
	@GeneratedValue
	private Long num;
	private String name;
	private Integer price;
	private Integer stock;
	
	@OneToOne (mappedBy = "product")
	private ProductDetail productDetail;
}
