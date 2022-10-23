
public class Lab10 {
    /* 1.Pentru exercitiile din clasa main() de data
    trecuta, creati metode separate pentru fiecare, tot in clasa Main.java, si apoi apelati-le in metoda main()
     */
     public static void name(){
         System.out.println("Hello Alexandra!");
     }




/*2. Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.

Fiecare metoda ar trebui sa primeasca doi parametrii de tip numar, sa execute operatia, si sa returneze rezultatul.
Apoi apelati metoda in main cu valorile cu care doriti sa executati operatia.

*/

    public static void main(String[] args) {

        int first = 5;
        int second = 4;
        int result = (first + second);

        System.out.println("Rezultatul adunarii este:" + Op(5, 4));
        System.out.println(Op1(5, 4));
        System.out.println(Op2(5, 4));
        System.out.println(Op3(5, 4));
    }

    public static int Op(int first, int second) {
        int result = first + second;
        return result;

    }

    public static int Op1(int one, int two) {
        int result1 = one - two;
        return result1;

    }

    public static int Op2(int great, int greatest) {
        int result2 = great * greatest;
        return result2;

    }

    public static int Op3(int ola, int ola1) {
        int result3 = ola / ola1;
        return result3;

    }



    /* 3. Scrieti o metoda java, care sa afiseze urmatorul model*/


    public static void joculet() {


        System.out.println(" " + " " + " " + "J" + "  " + "  " + "a" + "   " + "v" + "   " + "  " + "v" + " " + " " + "a");
        System.out.println(" " + " " + " " + "J" + " " + " " + " a" + " a" + " " + " " + " v" + " " + " " + " v " + " " + "a " + "" + "a");
        System.out.println("J" + " " + " " + "J" + " " + " " + "aaaaa" + " " + " " + " " + "v" + " " + "v " + " " + "aaaaa");
        System.out.println(" " + "J" + "J" + "" + " " + " " + "a" + " " + " " + " " + " " + " " + "a" + " " + " " + " " + "v" + " " + " " + "a" + " " + " " + " " + " " + " " + "a");
    }
    /*4.Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor*/


    public static void calcul() {
        int op8 = 3;
        int op9 = 9;
        int op10 = 8;
        int result = (op8 + op9 + op10);

        System.out.println("Rezultatul mediei este:" + sum(3, 9, 8));

    }

    public static int sum(int op8, int op9, int op10) {
        int result1 = op8 * op9 + op10;
        return result1;

    }


    /*6. Scrieti o metoda java, care sa returneze restul impartirii a doua numere*/

    public static void calcul1() {
        int number = 30;
        int number2 = 2;
        int result10 = (number / number2);

        System.out.println("Rezultatul impartirii este: " + number2(30, 2));
    }

    public static int number2(int number, int number2) {
        int result10 = number / number2;
        return result10;

    }
     /*7.Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte
      temperatura in Fahrenheit, si sa returneze temperatura in Celsius. Formula de calcul este: C = 5/9 * (F -32)*/

    public static int fahrenheit() {
        int F = 89;
        int grade = 5;
        int grade1 = 9;
        int grade2 = 32;
        int celsius = (5 / 9 * (F - 32));

        System.out.println(celsius);

    }
    public static int celsius( int F, int grade,int grade1, int grade2){
        int celsius = grade /grade1 * (F - grade2);
        return celsius;

    }



    }







