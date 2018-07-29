package com.example.demo.domain.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Post {
	
	@Id
	@GeneratedValue
	int id;

	@NotNull
	@Size(min = 1, max = 255)
	@Column(nullable = false)
	String title;

	@Size(max = 255)
	String subtitle;

	@NotNull
	//@Size(min = 1, max = 100000000)
	@Size(max = 100000000)
	@Column(length = 100000000)
	String content;

	@DateTimeFormat(iso = ISO.DATE_TIME)
	LocalDateTime regDate;
}
