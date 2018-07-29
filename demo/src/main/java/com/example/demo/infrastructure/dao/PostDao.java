package com.example.demo.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.model.entity.Post;

public interface PostDao extends JpaRepository<Post, Integer> {

}