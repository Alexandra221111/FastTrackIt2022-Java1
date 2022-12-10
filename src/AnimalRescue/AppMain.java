package AnimalRescue;

import jdk.swing.interop.SwingInterOpUtils;

public class AppMain {

    public static void main(String[] args) {

        Dog rudolph = new Dog();

        System.out.println("The dog's name is" + rudolph.name);

        System.out.println("The dog's age is " + rudolph.age + "years");

        System.out.println("The dog's breed is " + rudolph.breed );

        System.out.println("The dog's colour is" + rudolph.colour);

        System.out.println("The dog's weight is " + rudolph.weight + "kgs");

        System.out.println("The dog's gender is " + rudolph.gender);

        rudolph.running();

        rudolph.eat();

        rudolph.speak();

        rudolph.sleep();




        Cat olive = new Cat();

        System.out.println("The cat's name is "+ olive.name);

        System.out.println("The cat's age is " + olive.age + "years" );

        System.out.println("The cat's breed is "+ olive.breed);

        System.out.println(" The cat's colour is " + olive.colour);

        System.out.println("The cat's weight is "+ olive.weight + "kgs");

        System.out.println("The cat's gender is "+ olive.gender);

        olive.eat();

        olive.hide();

        olive.play();

        olive.run();

        olive.sleep();

        olive.speak();

        olive.vibrate();




        Girl Rania = new Girl();

        System.out.println("The girl's name is "+ Rania.name);

        System.out.println(" The girl's age is "+ Rania.age + "years old ");

        System.out.println("The girl works at the " + Rania.work);

        System.out.println("The money she owns is " + Rania.moneyInThePurse + "Lei");

        System.out.println("The girl's weight is " + Rania.weight + "Kg");

        System.out.println("The gender is " + Rania.gender);


        Rania.pay();

        Rania.work();

        Rania.care();

        Rania.eat();

        Rania.sleep();



        DogFood Pedigree = new DogFood();

        System.out.println("The name of the food is " + Pedigree.name);

        System.out.println("The price of the bag is" + Pedigree.price + "lei");

        System.out.println("The quality of the food is"+ Pedigree.quality + "level");

        System.out.println("The availability of the product is "+ Pedigree.availability);

        Pedigree.acid();

        Pedigree.calcium();

        Pedigree.oil();

        Pedigree.protein();

        Pedigree.vitamin();



        CatFood Purina = new CatFood();

        System.out.println("The name of the food is " + Purina.name);

        System.out.println("The price of the bag is" + Purina.price + "lei");

        System.out.println("The quality of the food is"+ Purina.quality + "level");

        System.out.println("The availability of the product is "+ Purina.availability);

        Purina.acid();

        Purina.calcium();

        Purina.protein();

        Purina.vitamin();




        DoctorVet Andrew = new DoctorVet();

        System.out.println("The doctor's name is "+ Andrew.name);

        System.out.println(" The doctor's age is "+ Andrew.age + "years old ");

        System.out.println("The doctor's occupation is" + Andrew.work);

        System.out.println("The doctor's weight is " + Andrew.weight + "Kg");

        System.out.println("The gender is " + Andrew.gender);


        Andrew.consult();

        Andrew.diagnostics();

        Andrew.heal();

        Andrew.recommendation();

        Andrew.work();

    }


}
