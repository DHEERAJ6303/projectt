package com.digit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digit.entity.OrderDetails;
@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {

}
