package com.study.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	private String title;
	private String content;
	private int idx;
	
	
	
}
