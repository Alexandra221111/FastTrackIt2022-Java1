package AnimalRescue;

public class People {
    private String name;
    private String work ;
    private int age ;
    private int weight ;
    private String gender ;


    public void setName(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }
    public void setWork(String work) {
        this.work = work;
    }
    public String getWork() {
        return work;
    }

    public void setAge (int age){
        this.age = age;
    }
    public int getAge() {
        return age;
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

    public void eat(){
        System.out.println("Eating food");

    }
    public void work(){
        System.out.println("Prepare cheesecakes");

    }
    public void sleep(){
        System.out.println("Sleeping and sometimes snorring because of hard work she does everyday");

    }

    public void pay(){

        System.out.println("Paying all the bills and something for her pleasure ");
    }

    public void care(){
        System.out.println("Taking care of her and her two wonderful pets, Rudolph and Olive");
    }
}
