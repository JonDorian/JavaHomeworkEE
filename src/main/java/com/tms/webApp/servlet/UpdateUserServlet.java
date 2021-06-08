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
  int currentUserId;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    currentUserId = Integer.parseInt(req.getParameter("userId"));
    req.setAttribute("userId", currentUserId);
    req.getRequestDispatcher("WEB-INF/updateUser.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    if (!usersRepository.getUserList().isEmpty()) {
      for (User user: usersRepository.getUserList()) {
        if (user.getId() == currentUserId){
          user.setName(req.getParameter("newName"));
          user.setLastName(req.getParameter("newLastName"));
          user.setAge(Integer.parseInt(req.getParameter("newAge")));
          break;
        }
      }
    }
    resp.sendRedirect("userInfo");
  }
}
