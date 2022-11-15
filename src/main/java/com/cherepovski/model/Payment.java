package com.cherepovski.model;

import lombok.*;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Payment {
    private int id;
    private String pan;
    private int amount;


}
