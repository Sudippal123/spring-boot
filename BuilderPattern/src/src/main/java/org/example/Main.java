package org.example;

import org.example.better_code.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.Builder()
                .firstName("Sudip")
                .lastName("Pal")
                .age(25)
                .username("sudippal1810@gmail.com")
                .password("a3v56c8#")
                .build();
        String userDetail = "First Name:"+user1.getFirstName()+" Last Name:"+user1.getLastName()+" Age:"+user1.getAge()+" User Name:"+user1.getUsername();
        System.out.println(userDetail);
    }
}