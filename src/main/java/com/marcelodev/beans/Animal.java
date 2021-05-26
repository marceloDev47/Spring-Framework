package com.marcelodev.beans;

public class Animal {

  private int id;
  private String tipo;
  private String color;

  public Animal(int id) {
    this.id = id;
  }

  public Animal(String t) {
    this.tipo = t;
  }

  public Animal(int id, String t, String c) {
    this.id = id;
    this.tipo = t;
    this.color = c;
  }

  public Animal() {

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }



}
