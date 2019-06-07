package Lesson04Task02;

//2. Implement the method fight() depending on weight, strength and age of the boxer:
//    You should write dependency by yourself. The method should return true or false if our boxer won or lost.
//1) if ourBoxer.fight(anotherBoxer) returns true, then anotherBoxer.fight(outBoxer) should return false;

public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        // write your code here
        int points = 0;

        if (this.age >= 25 && this.age <= 33){
            points +=2;
        } else if ( ( this.age >18 && this.age <25 ) || ( this.age >33 && this.age < 40 )){
            points +=1;
        }
        if (anotherBoxer.age >= 25 && anotherBoxer.age <= 33){
            points -=2;
        } else if ( ( anotherBoxer.age > 18 && anotherBoxer.age < 25 ) || ( anotherBoxer.age > 33 && anotherBoxer.age < 40 ) ){
            points -=1;
        }
        points += this.weight/20;
        points -= anotherBoxer.weight/20;
        points += this.strength/10;
        points -= anotherBoxer.strength/10;
        if (points == 0){
            points = (this.hashCode() < anotherBoxer.hashCode())?1:0;
        }
        if (points > 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Boxer ourBoxer = new Boxer(25, 85, 75);
        Boxer anotherBoxer = new Boxer(25, 85, 75);
        System.out.println(ourBoxer.fight(anotherBoxer));
        System.out.println(anotherBoxer.fight(ourBoxer));
    }
}