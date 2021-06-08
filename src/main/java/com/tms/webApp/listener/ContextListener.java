package com.tms.webApp.listener;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {
  @Override
  public void contextInitialized(ServletContextEvent sce) {
    System.out.println("Контекст сервлета проинициализирован!");
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    System.out.println("Контекст сервлета уничтожен!");
  }
}
