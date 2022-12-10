package AnimalRescue;

import jdk.swing.interop.SwingInterOpUtils;

public class AppMain {

    public static void main(String[] args) {

        Dog rudolph = new Dog();


        rudolph.setName("Rudolph");

        System.out.println("The dog's name is" + rudolph.getName());



         rudolph.setAge(2);

        System.out.println("The dog's age is " + rudolph.getAge() + "years");



        rudolph.setBreed("Husky");

        System.out.println("The dog's breed is " + rudolph.getBreed() );



        rudolph.setColour("Blue");

        System.out.println("The dog's colour is" + rudolph.getColour());


        rudolph.setWeight(30);

        System.out.println("The dog's weight is " + rudolph.getWeight() + "kgs");


        rudolph.setGender("Male");

        System.out.println("The dog's gender is " + rudolph.getGender());


        rudolph.running();

        rudolph.eat();

        rudolph.speak();

        rudolph.sleep();




        Cat olive = new Cat();

        olive.setName("olive");
        System.out.println("The cat's name is "+ olive.getName());



        olive.setAge(4);
        System.out.println("The cat's age is " + olive.getAge()+ "years" );



        olive.setBreed("British short hair");
        System.out.println("The cat's breed is "+ olive.getBreed());




        olive.setColour("Brown");
        System.out.println(" The cat's colour is " + olive.getColour());



        olive.setWeight(5);
        System.out.println("The cat's weight is "+ olive.getWeight() + "kgs");


        olive.setGender("female");
        System.out.println("The cat's gender is "+ olive.getGender());


        olive.eat();

        olive.hide();

        olive.play();

        olive.run();

        olive.sleep();

        olive.speak();

        olive.vibrate();




        Girl Rania = new Girl();


        Rania.setName("Rania");


        Rania.setWork("Cheesecake Factory Worker");

        Rania.setAge(18);

        Rania.setMoneyInThePurse(500);

        Rania.setWeight(65);

        Rania.setGender("Female");



        System.out.println("The girl's name is "+ Rania.getName());

        System.out.println(" The girl's age is "+ Rania.getAge()+ "years old ");

        System.out.println("The girl works at the " + Rania.getWork());

        System.out.println("The money she owns is " + Rania.getMoneyInThePurse() + "Lei");

        System.out.println("The girl's weight is " + Rania.getWeight() + "Kg");

        System.out.println("The gender is " + Rania.getGender());


        Rania.pay();

        Rania.work();

        Rania.care();

        Rania.eat();

        Rania.sleep();



        DogFood Pedigree = new DogFood();



        Pedigree.setName("Pedigree");

        Pedigree.setPrice(126);

        Pedigree.setQuality("High");

        Pedigree.setAvailability("in stock");

        System.out.println("The name of the food is " + Pedigree.getName());

        System.out.println("The price of the bag is" + Pedigree.getPrice() + "lei");

        System.out.println("The quality of the food is"+ Pedigree.getQuality()+ "level");

        System.out.println("The availability of the product is "+ Pedigree.getAvailability());

        Pedigree.acid();

        Pedigree.calcium();

        Pedigree.oil();

        Pedigree.protein();

        Pedigree.vitamin();




        CatFood Purina = new CatFood();






        Purina.setName("Purina");

        Purina.setPrice(44);

        Purina.setQuality("High");

        Purina.setAvailability("in stock");


        System.out.println("The name of the food is " + Purina.getName());

        System.out.println("The price of the bag is" + Purina.getPrice() + "lei");

        System.out.println("The quality of the food is"+ Purina.getQuality()+ "level");

        System.out.println("The availability of the product is "+ Purina.getAvailability());

        Purina.acid();

        Purina.calcium();

        Purina.protein();

        Purina.vitamin();




        DoctorVet Andrew = new DoctorVet();




        Andrew.setName("Andrew");

        Andrew.setAge(43);

        Andrew.setWork("Doctor Vet");

        Andrew.setWeight(78);

        Andrew.setGender("Male");

        System.out.println("The doctor's name is "+ Andrew.getName());

        System.out.println(" The doctor's age is "+ Andrew.getAge() + "years old ");

        System.out.println("The doctor's occupation is" + Andrew.getWork());

        System.out.println("The doctor's weight is " + Andrew.getWeight() + "Kg");

        System.out.println("The gender is " + Andrew.getGender());


        Andrew.consult();

        Andrew.diagnostics();

        Andrew.heal();

        Andrew.recommendation();

        Andrew.work();


    }



}
