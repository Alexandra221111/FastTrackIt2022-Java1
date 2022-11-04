package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        Dog rudolph = new Dog();

        rudolph.setName("Rudolph");

        rudolph.setAge(6);



        System.out.println("The dog's name is:" + rudolph.getName());


        System.out.println("The dog's age is:"+ rudolph.getAge());




        System.out.println("The dog's weight is:" + rudolph.weight + "Kg");

        rudolph.eat();

        rudolph.run();

        rudolph.speak();

        rudolph.sleep();

    }
}
