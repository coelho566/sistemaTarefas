package br.com.unicesumar.service;

import br.com.unicesumar.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private static List<User> users = new ArrayList<>();



    public static void create(User user) {
        users.add(user);
    }

    public static void update(Integer userId, User user) {

        if (userId != null) {
            User newUser = users.get(userId);

            newUser.setId(user.getId());
            newUser.setName(user.getName());
            newUser.setEmail(user.getEmail());
            newUser.setCharge(user.getCharge());

            users.add(newUser);
        } else {
            throw new RuntimeException("User not found");
        }
    }

    public static void delete(Integer userId) {

        if (userId != null)
            users.remove(userId);
        else
            throw new RuntimeException("User not found");

    }

    public static List<User> getUsers() {
        return users;
    }
}
