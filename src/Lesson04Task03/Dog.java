package Lesson04Task03;

//3. Create a class Dog.
//    The dog should have a name and an age (private).
//    Create getters and setter for all the fields.
//    1) When you will be creating setters - keep in mind that fields shouldn't be empty and age can't be less of equals to zero.

public class Dog {

    private String name;
    private int age;

    public Dog(){
        this.name = "Rex";
        this.age = 5;
    }

    public Dog(String name) {
        this.name = (name != "")? name:"Rex";
        this.age = 5;
    }

    public Dog(int age) {
        this.name = "Rex";
        this.age = (age >= 0) ? age : 5;
    }

    public Dog(String name, int age) {
        this.name = (name != "")? name:"Rex";
        this.age = (age >= 0) ? age : 5;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = (name != "")? name:"Rex";
    }

    public void setAge(int age) {
        this.age = (age >= 0) ? age : 5;
    }

}
