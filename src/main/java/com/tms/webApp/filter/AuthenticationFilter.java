package com.tms.webApp.filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "auth", urlPatterns = {"/admin", "/userInfo", "/addUser", "/updateUser"})
public class AuthenticationFilter extends HttpFilter {

  @Override
  protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
    final HttpSession session = req.getSession();

    if (session == null) {
      res.sendError(401);
      return;
    }

    String name = (String) session.getAttribute("expectedLogin");

    if (name == null || !name.equals(getServletContext().getInitParameter("expectedLogin"))) {
      res.sendError(401);
      return;
    }

    chain.doFilter(req, res);
  }
}