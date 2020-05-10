package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.entities.enums.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
