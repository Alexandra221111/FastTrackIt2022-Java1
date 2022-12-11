import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);

        int[] myArray = {12,3,4,5};

        System.out.println("Enter a number: ");

        int numberFromKeyboard = scan.nextInt();
        try{
            System.out.println(myArray[numberFromKeyboard]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Numarul nu se afla in intervalul[ 0 -" + (myArray.length)+ "]");
        }
        System.out.println("aici");
    }
}
