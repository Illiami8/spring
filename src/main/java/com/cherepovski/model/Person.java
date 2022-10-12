package com.cherepovski.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class Person implements Printing {
    protected int id;
    protected String name;
}
