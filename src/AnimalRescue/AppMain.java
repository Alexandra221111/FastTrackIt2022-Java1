package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        Dog rudolph = new Dog();

        System.out.println("The dog's name is:" + rudolph.name);

        System.out.println("The dog's age is:"+ rudolph.age);

        rudolph.age= 6;
        System.out.println("The dog's age is:" + rudolph.age + "years");

        System.out.println("The dog's weight is:" + rudolph.weight + "Kg");

        rudolph.eat();

        rudolph.run();

        rudolph.speak();

        rudolph.sleep();

    }
}
