package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static final List<User> users;

    static {
        users = new ArrayList<>();

        users.add(new User("suong", "123456", "hứa thu sương", "huathusuong@codegym.vn", 22));
        users.add(new User("suongle", "123456", "lê thị sương", "lethisuong@codegym.vn", 22));
        users.add(new User("anh", "123456", "trần thị ngọc anh", "tranthingocanh@codegym.vn", 23));
        users.add(new User("thuy", "123456", "lâm thị thủy", "lamthithuy@codegym.vn", 22));
        users.add(new User("thien", "123456", "ali quốc thiên", "aliquocthien@codegym.vn", 24));
    }

    public static User checkLogin(Login login) {
        for (User user : users) {
            if (user.getAccount().equals(login.getAccount()) &&
                    user.getPassword().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
