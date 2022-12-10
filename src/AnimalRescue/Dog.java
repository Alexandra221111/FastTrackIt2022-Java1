package AnimalRescue;

public class Dog {

    private String name;
    private int age;
    private String breed;
    private String colour ;
    private int weight;
    private String gender;

    public void setName(String name){
        this.name = name;

    }
    public String getName() {
        return name;

    }
        public void setAge (int age){
            this.age = age;
        }
        public int getAge() {
            return age;
        }

            public void setBreed(String breed){
                this.breed = breed;
            }

            public String getBreed() {
                return breed;
            }

    public void setColour(String colour){
        this.colour = colour;
    }
    public String getColour() {
        return colour;

    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight() {
        return weight;

    }
    public void setGender(String gender){
        this.gender = gender;

    }
    public String getGender() {
        return gender;
    }

        public void eat () {
            System.out.println("Eating yum yum ");
        }
        public void sleep () {
            System.out.println("Snorring Zzzzz");
        }
        public void speak () {
            System.out.println("Woof woof miau!");
        }
        public void running () {
            System.out.println("Running..");
        }
        public void tailWiggling () {
            System.out.println("Wiggling the tail");

        }

    }


