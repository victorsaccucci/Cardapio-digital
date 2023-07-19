package com.victorsaccucci.cardapio.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "foods")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tittle;
    private String image;
    private Double price;

    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.tittle = data.tittle();
        this.price = data.price();
    }
}
