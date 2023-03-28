package ru.project.Project6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.Project6.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
