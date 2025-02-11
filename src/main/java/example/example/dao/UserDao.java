package example.example.dao;

import example.example.entity.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void saveUser(User user);

    void removeById(Long id);

    User findById(Long id);
}
