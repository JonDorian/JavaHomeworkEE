package com.tms.webApp.servlet;
import com.tms.webApp.repository.UsersRepository;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/deleteUser")
public class DeleteUserServlet extends HttpServlet {

  UsersRepository usersRepository = UsersRepository.getUsersRepository();

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    int listNumber = Integer.parseInt(req.getParameter("listNumber"));
    usersRepository.deleteUser(listNumber);
    resp.sendRedirect("userInfo");
  }
}
