package com.tms.webApp.servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "login", value = "/login")
public class LoginServlet extends HttpServlet {
  private String expectedLogin;
  private String expectedPassword;

  @Override
  public void init() {
    expectedLogin = getServletContext().getInitParameter("expectedLogin");
    expectedPassword = getServletContext().getInitParameter("expectedPassword");
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    String userLogin = req.getParameter("login");
    String userPassword = req.getParameter("pass");
    if (!userLogin.equals(expectedLogin) || !userPassword.equals(expectedPassword)) {
      resp.sendError(401);
      return;
    } else {
      final HttpSession session = req.getSession(true);
      session.setAttribute("expectedLogin", userLogin);
      resp.sendRedirect("admin");
    }
  }
}