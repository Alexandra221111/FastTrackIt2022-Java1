package AnimalRescue;

public abstract class Cat extends Animal {



      public void hide(){
            System.out.println("Hidding in the closet, behind the computer, under the tv, everywhere..");
      }

      public void vibrate(){
            System.out.println("More puuur puuur");
      }

      public void play(){
            System.out.println("Here's is a glass, what happens when is going down miau miau");

      }

      @Override
      public void speak() {
            System.out.println("Miau Miau!");
      }

      @Override
      public void running() {
            System.out.println("Formula 1 ");
      }

      @Override
      public void tailWiggling() {
      System.out.println("Soft left right!");;
      }

      @Override
      public void eat() {
            super.eat();
      }

      @Override
      public void sleep() {
            super.sleep();
      }
}


