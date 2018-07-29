package com.example.demo.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.model.entity.Hello;

public interface HelloDao extends JpaRepository<Hello, Integer>{

}
