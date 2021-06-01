package com.marcelodev.beans;

import java.util.List;

public class Pais {
  private int id;
  private String nombre;
  // private Ciudad ciudad;
  private List<Ciudad> ciudades;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public List<Ciudad> getCiudades() {
    return ciudades;
  }

  public void setCiudades(List<Ciudad> ciudades) {
    this.ciudades = ciudades;
  }

  // public Ciudad getCiudad() {
  // return ciudad;
  // }
  //
  // public void setCiudad(Ciudad ciudad) {
  // this.ciudad = ciudad;
  // }



}
