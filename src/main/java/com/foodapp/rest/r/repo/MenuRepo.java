package com.foodapp.rest.r.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodapp.rest.r.model.Menu;

public interface MenuRepo extends JpaRepository<Menu, Integer>{

}
