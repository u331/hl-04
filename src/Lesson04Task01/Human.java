package Lesson04Task01;

/*1. Create a class "Human". A human should have the following attributes:
        weight, age, first name, last name, height.*/
/*1) Create a class Human with all the required fields to store the information (variable types you could choose by yourself).
  2) Add to the class a constructor with parameters which initialize all the fields.*/

public class Human {

    private double weight;
    private int age;
    private String firstName;
    private String lastName;
    private double height;

    Human(String firstName, String lastName, int age, double height, double weight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

}
