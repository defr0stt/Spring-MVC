package ua.lpnu.spring_mvc.models;


import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person
{
    private int id;

    @NotEmpty(message = "Name should not be empty")     // not null name; next string parameter it's name of error
    @Size(min = 2, max = 20, message = "Too short or too long name")
    private String name;

//    @NotEmpty - don't use with primitive types
    @Min(value = 1, message = "Not correct age")
    private int age;

    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Not correct email")
    private String email;

    public Person() {

    }

    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}