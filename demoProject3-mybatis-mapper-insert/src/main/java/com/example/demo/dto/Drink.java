package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Drink {
    private int drinksId;
    private String drinksName;
    private int drinksPrice;
    private int drinksQuantity;

}
