package com.tms.webApp.servlet;
import com.tms.webApp.repository.UsersRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserInfo", value = "/userInfo")
public class UserInfoServlet extends HttpServlet {
  private final UsersRepository usersRepository = UsersRepository.getUsersRepository();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setAttribute("userList", usersRepository.getUserList());
    req.getRequestDispatcher("WEB-INF/userInfo.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    super.doPost(req, resp);
  }
}
