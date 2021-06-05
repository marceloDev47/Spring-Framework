package com.marcelodev.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.marcelodev.interfaces.IEquipo;

// Se prueba App7
// Implementamos la anotación @Component para que pueda ser escaneado

@Component("messi")
public class Jugador2 {
  private int numero;

  @Value("Lio Messi")
  private String nombre;
  // Uso de Autowired mediante anotaciones
  @Autowired
  @Qualifier("barcelonaQualifier")
  private IEquipo equipo;

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public IEquipo getEquipo() {
    return equipo;
  }

  public void setEquipo(IEquipo equipo) {
    this.equipo = equipo;
  }


}
