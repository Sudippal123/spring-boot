package org.example.problematic_code;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String username;
    private String password;

    User(String firstName,String lastName,int age,String username,String password){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.username =username;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getUsername(){
        return this.username;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String _password) {
        this.password = _password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
/*
    1) Too Many Constructor Parameters (telescoping constructor)
    => If a class has many parameters, constructors become hard to manage.
    2) Readable and Maintainable Code
    => It is very difficult to maintain such huge and extendable code.
    3) Immutability
    => This object can be modified at any time using setter.

 */