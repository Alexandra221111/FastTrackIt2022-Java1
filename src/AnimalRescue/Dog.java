package AnimalRescue;

public abstract class Dog extends Animal{


        public void tailWiggling () {
            System.out.println("Wiggling the tail");

        }

    @Override
    public void speak() {
        System.out.println("Woof woof!");
    }
}


