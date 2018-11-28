package com.oocl.web.sampleWebApp;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private List<User> users;
    private int nextID;

    public Service() {
        users = new ArrayList<>();
        nextID = 0;
    }

    public int addUser(User user) {
        user.userID = nextID++;
        users.add(user);
        return user.userID;
    }

}
