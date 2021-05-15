package com.tms.webApp.repository;
import com.tms.webApp.entity.User;
import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
  private static final UsersRepository USERS_REPOSITORY = new UsersRepository();
  private List<User> userList = new ArrayList<>();

  private UsersRepository() {
    userList.add(new User("Ivan", "Karpovich", 22));
    userList.add(new User());
    userList.add(new User("Aleksey", "Popov", 53));
    userList.add(new User("Rodion", "Titovich", 29));
  }

  public static UsersRepository getUsersRepository() {
    return USERS_REPOSITORY;
  }

  public List<User> getUserList() {
    return userList;
  }

  public void addNewUserToList(User newUser) {
    userList.add(newUser);
  }

  public void updateUser(int userId, User user) {
    if (!userList.isEmpty() && userId < userList.size()) {
      userList.set(userId, user);
    }
  }

  public void deleteUser(int userId) {
    userList.remove(userId);
  }
}
