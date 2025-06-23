package org.example.better_code;

public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String username;
    private final String password;

    private User(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.username = builder.username;
        this.password = builder.password;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private int age;
        private String username;
        private String password;
        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder username(String username){
            this.username = username;
            return this;
        }
        public Builder password(String password){
            this.password = password;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }
}

/*
    1)Final fields
    => Can not be reassigned after construction
    2)No Setters
    => Prevent modification after object creation
    3) Constructor
    => All fields will be set in constructor.




*/