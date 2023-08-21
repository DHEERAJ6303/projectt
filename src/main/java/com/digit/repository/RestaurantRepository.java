package com.digit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digit.entity.Restaurant;
@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

}
