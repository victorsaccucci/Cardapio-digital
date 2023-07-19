package com.victorsaccucci.cardapio.entities;

public record FoodResponseDTO(Long id, String tittle, String image, Double price) {
    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getTittle(), food.getImage(), food.getPrice());
    }
}
