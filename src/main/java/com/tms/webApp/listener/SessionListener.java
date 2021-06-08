package com.tms.webApp.listener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {
  @Override
  public void sessionCreated(HttpSessionEvent se) {
    System.out.println("Создана сессия с ID: " + se.getSession().getId());
  }

  @Override
  public void sessionDestroyed(HttpSessionEvent se) {
    System.out.println("Сессия " + se.getSession().getId() + " завершена!");
  }
}