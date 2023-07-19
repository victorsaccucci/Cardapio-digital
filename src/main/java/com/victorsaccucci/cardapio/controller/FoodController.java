package com.victorsaccucci.cardapio.controller;

import com.victorsaccucci.cardapio.entities.Food;
import com.victorsaccucci.cardapio.entities.FoodRequestDTO;
import com.victorsaccucci.cardapio.entities.FoodResponseDTO;
import com.victorsaccucci.cardapio.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {
    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping()
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food food = new Food(data);
        repository.save(food);
        return;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll(){
    List<FoodResponseDTO> foodList =  repository.findAll().stream().map(FoodResponseDTO::new).toList();
    return foodList;
    }
}
