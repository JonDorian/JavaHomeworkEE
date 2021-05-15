package com.tms.webApp.servlet;
import com.tms.webApp.entity.User;
import com.tms.webApp.repository.UsersRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/updateUser")
public class UpdateUserServlet extends HttpServlet {
  private final UsersRepository usersRepository = UsersRepository.getUsersRepository();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    int numberOfUsers = usersRepository.getUserList().size();
    req.setAttribute("numberOfUsers", numberOfUsers);
    req.getRequestDispatcher("WEB-INF/updateUser.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    if (!usersRepository.getUserList().isEmpty()) {
      int id = Integer.parseInt(req.getParameter("userId")) - 1;
      final User user = new User(req.getParameter("newName"), req.getParameter("newLastName"), Integer.parseInt(req.getParameter("newAge")));
      usersRepository.updateUser(id, user);
    }
    resp.sendRedirect("userInfo");
  }
}
