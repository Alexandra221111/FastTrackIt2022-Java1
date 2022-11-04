package AnimalRescue;

public class Dog {

    private String name;
    private int age;
    private String Breed;

    String color = "Blue";
    double weight = 30.5;
    String gender = "Male";

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;

    }
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }






    public void eat(){
        System.out.println("Eating yum yum..");
    }

    public void sleep(){
        System.out.println("Snoring ZzzZz ");
    }

    public void speak(){
        System.out.println("Woof woof miau!");
    }

    public void run(){
        System.out.println("running...");
    }

    public void tailWiggling(){
        System.out.println("Wiggling the tail");
    }

}
