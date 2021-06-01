package com.marcelodev.beans;

public class Persona {

  private int idPersona;
  private String nombre;
  private Pais pais;
  private Ciudad ciudad;// agregado para App3.java

  /* ciclo de vida del bean */
  private void init() {
    System.out.println("Se inicializa el bean");
  }

  private void destroy() {
    System.out.println("se destruye el bean");
  }
  /* ######################################## */

  public int getIdPersona() {
    return idPersona;
  }

  public void setIdPersona(int idPersona) {
    this.idPersona = idPersona;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Pais getPais() {
    return pais;
  }

  public void setPais(Pais pais) {
    this.pais = pais;
  }

  public Ciudad getCiudad() {
    return ciudad;
  }

  public void setCiudad(Ciudad ciudad) {
    this.ciudad = ciudad;
  }


}
