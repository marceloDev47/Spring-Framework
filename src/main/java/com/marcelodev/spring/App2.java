package com.marcelodev.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.marcelodev.beans.AppConfig;
import com.marcelodev.beans.AppConfig2;
import com.marcelodev.beans.Mundo;

public class App2 {

  public static void main(String[] args) {
    // Gestionando beans por anotaciones en lugar de archivo xml
    // ApplicationContext appContext =
    // new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
    // también se puede utilizar en lugar de comas y el applicationContext, el register con el mismo
    // contexto
    AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
    appContext.register(AppConfig.class);
    appContext.register(AppConfig2.class);
    appContext.refresh();

    Mundo m = (Mundo) appContext.getBean("persona"); // o Mundo m = appContext.getBean(Mundo.class);
    System.out.println(m.getSaludo());
  }

}
