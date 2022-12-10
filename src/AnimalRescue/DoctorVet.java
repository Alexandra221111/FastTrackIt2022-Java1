package AnimalRescue;

public class DoctorVet {


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







    public void heal(){
        System.out.println("Healing the pet");
    }
    public void work(){
        System.out.println("Working as doctor for pets");
    }
    public void recommendation(){
        System.out.println("Recommend treatments ");
    }
    public void consult(){
        System.out.println("Consult the pets");
    }
    public void diagnostics (){
        System.out.println("Read and translate the diagnostic of every pet");
    }
}
