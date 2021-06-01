package com.marcelodev.beans;

import com.marcelodev.interfaces.IEquipo;

public class Barcelona implements IEquipo {

  @Override
  public String mostrar() {
    return "Barcelona FC";
  }

}
