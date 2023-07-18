package com.victorsaccucci.cardapio.repositories;

import com.victorsaccucci.cardapio.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
