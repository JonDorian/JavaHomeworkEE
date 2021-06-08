package com.tms.webApp.repository;
import com.tms.webApp.entity.User;
import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
  private static final UsersRepository USERS_REPOSITORY = new UsersRepository();
  private List<User> userList = new ArrayList<>();

  private UsersRepository() {
    userList.add(new User("Ivan", "Karpovich", 22));
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

  public User getUser(int index) {
    return userList.get(index);
  }

  public void updateUser(int listNumber, User user) {
    if (!userList.isEmpty() && listNumber < userList.size()) {
      userList.set(listNumber, user);
    }
  }

  public void deleteUser(int listNumber) {
    userList.remove(listNumber);
  }
}
