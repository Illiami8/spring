package com.cherepovski.model;

public interface Printing {
  default void print(){
      System.out.println(this);
  }

}
