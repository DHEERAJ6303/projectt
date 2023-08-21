package com.digit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digit.entity.FoodCart;
@Repository
public interface FoodCartRepository extends JpaRepository<FoodCart, Integer> {

}
