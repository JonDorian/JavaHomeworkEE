package com.tms.webApp.servlet;
import com.tms.webApp.entity.User;
import com.tms.webApp.repository.UsersRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/addUser"})
public class AddNewUserServlet extends HttpServlet {

  UsersRepository usersRepository = UsersRepository.getUsersRepository();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.getRequestDispatcher("WEB-INF/addNewUser.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    final User user = new User(req.getParameter("newName"), req.getParameter("newLastName"), Integer.parseInt(req.getParameter("newAge")));
    usersRepository.addNewUserToList(user);
    resp.sendRedirect("userInfo");
  }
}
