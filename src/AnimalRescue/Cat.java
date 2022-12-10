package AnimalRescue;

public class Cat {

      private String name ;
      private int age ;
      private String breed ;
     private String colour ;
    private   int weight ;
     private String gender ;




      public void setName(String name){
            this.name = name;
      }
      public String getName(){
            return name;
      }
      public void setAge(int age){
            this.age =age;
      }

      public int getAge() {
            return age;
      }

      public void setBreed(String breed){
            this.breed = breed;
      }
      public String getBreed(){
            return breed;
      }
      public void setColour(String colour){
            this.colour = colour;
      }
      public String getColour(){
            return colour;
      }
      public void setWeight(int weight){
            this.weight = weight;

      }
      public int getWeight(){
            return weight;
      }
      public void setGender(String gender){
            this.gender = gender;
      }

      public String getGender() {
            return gender;
      }




      public void eat (){
            System.out.println("Eating very much");
      }
      public void run(){
            System.out.println("Running fast");
      }
      public void hide(){
            System.out.println("Hidding in the closet, behind the computer, under the tv, everywhere..");
      }
      public void sleep(){
            System.out.println("sleeping puuur puuur ");
      }
      public void vibrate(){
            System.out.println("More puuur puuur");
      }
      public void speak(){
            System.out.println("miau miau");

      }
      public void play(){
            System.out.println("Here's is a glass, what happens when is going down miau miau");
      }
}

