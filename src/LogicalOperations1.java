import java.util.List;

public class LogicalOperations1 {
    //1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
// Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
// pornind de la numarul primit ca si parametru.
 /*   LogicalOperations1 logicalOp1 = new LogicalOperations1();

    int x = 1;

    public void untilHundred(int b) {

        for (int i = b; i <= 100; i++) {

            System.out.println(i);
        }

        logicalOp1.untilHundred(x);
    }
    //2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
    // pornind de la numarul primit ca si parametru.

    int d = 0;

    public void untilMinusHundred(int c) {

        for (int i = c; i >= -100; i--) {

            System.out.println(i);


        }
        logicalOp1.untilMinusHundred(d);

    }
//3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
// Metoda sa afiseze o numaratoare intre cele doua numere primite,
// pornind de la primul parametru primit, pana la cel de-al doilea
// (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.

    public void numbersBetween(int x, int y) {

        for (int i = x; i <= y; i++) {

            System.out.println(i);

        }

        for (int i = x; i >= y; i--) {

            System.out.println(i);

            logicalOp1.numbersBetween(x, y);
        }
    }
    //4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).

    public void numbersBetween(double a, double b) {

        if (a < b) {

            for (double i = a; i <= b; i++) {

                System.out.println(i);

            }

        } else if (b < a) {

            for (double i = b; i <= a; i++) {

                System.out.println(i);

            }

        } else {

            System.out.println("Numbers are equal!");

            logicalOp1.numbersBetween(a, b);
        }
    }
//5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void numberToNumber() {

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {

                System.out.println(i);

                logicalOp1.numberToNumber();
            }
        }
    }

    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void numberOffNumber() {

        for (int i = 0; i <= 100; i++) {

            if (i % 2 != 0) {

                System.out.println(i);

                logicalOp1.numberOffNumber();
            }

        }

    }
    //7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, iar la final sa returneze rezultatul.

    public int returnSum(int g) {

        int sum = 0;

        for (int i = g; i <= 100; i++) {

            sum += i;

        }

        return sum;

    }
    //8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100,
    // pornind de la numarul primit ca si parametru, si sa calculeze media numerelor.

    public int returnAverage(int b) {

        int x = 0;

        int y = 0;

        for (int i = b; i <= 100; i++) {

            x += i;

            y++;

        }

        return x / y;

    }
    // 9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar

    public void printAsterisks() {

        for (int l = 7; l >= 1; l--) {

            String text = "";

            for (int i = l; i >= 1; i--) {

                text = text + "*";

            }

            System.out.println(text);

        }

    }
//WHILE:
//
//
//1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
// Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100,
// pornind de la numarul primit ca si parametru.


    public void FirstVersusLastNumber(int first) {

        while (first <= 100) ;

        System.out.println(first);

        first++;

        LogicalOperations1 logicalOp2 = new LogicalOperations1();
        logicalOp2.FirstVersusLastNumber(first);
    }
    //2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
    // pornind de la numarul primit ca si parametru.

    public void LastVersusFirstName(int first) {
        while (first <= -100) ;

        System.out.println(first);

        first--;

        logicalOp1.LastVersusFirstName(first);
    }
    // 3. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
    // pana la cel de-al doilea
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.


    int second = 3;
    int third = 4;

    public void oneNumberToAnother(int second, int third) {

        while (second <= third) ;

        System.out.println(second);

        second++;
    }
    //4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).

    public void NumberToNumber(int third, int fourth) {

        if (third < fourth) {

            while (third <= fourth) {

                System.out.println(third);

                third++;

            }

        } else if (fourth < third) {

            while (fourth <= third) {

                System.out.println(third);

                third++;

            }

        } else {

            System.out.println("The numbers are equal");
        }
    }
    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void matchNumbers() {
        int number = 1;
        while (number <= 100) {
            number++;
            if (number % 2 == 0) {
                System.out.println(number);
            }

        }

    }
    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void notMatchNumbers() {

        int number = 1;
        while (number <= 100) {
            number++;
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
    //7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
    // Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
    // Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.

    public void MediumRare() {

        int first = 111;

        int second = 8899;

        double x = 0;

        int count = 0;


        while (first <= second) {

            x += first;

            first++;

            count++;

        }

        System.out.println(x);

        double average = x / count;

        System.out.println("The average of the numbers is: " + average);

    }
    //8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7, din acel interval.

    public float numberDividedFromSeven(int first, int second) {

        float count = 0F;

        float sum = 0F;

        while (first <= second) {

        }

        if (first % 7 == 0) {

            count++;

            sum += first;

        }

        first++;


        float average = sum / count;

        return average;
    }
    //9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

    public void fibonacci() {

        int x = 20;

        int z = 0;

        int y = 1;


        int i = 1;

        while (i <= x) {

            System.out.print(z + " ");

            int numbers = z + y;

            z = y;

            y = numbers;

            i++;

        }

    }

    //10. Creati o metoda numita CozaLozaWoza.
    public void wozaCozaLoza() {

        int i = 1;

        while (i <= 110) {

            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {

                System.out.print("CozaLozaWoza ");

            } else if (i % 5 == 0 && i % 7 == 0) {

                System.out.print("WozaLoza ");

            } else if (i % 3 == 0 && i % 7 == 0) {

                System.out.print("CozaWoza ");

            } else if (i % 3 == 0 && i % 5 == 0) {

                System.out.print("CozaLoza ");

            } else if (i % 7 == 0) {

                System.out.print("Woza ");

            } else if (i % 5 == 0) {

                System.out.print("Loza ");

            } else if (i % 3 == 0) {

                System.out.print("Coza ");

            } else {

                System.out.print(i + " ");

            }

            if (i % 11 == 0) {

                System.out.println();

            }

            i++;

        }

    }

    public int[] getArrayOfValues(int positions) {

        int[] myArray = new int[positions];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        return myArray;

    }

    public void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[1] + " ");
        }
    }

    //2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii,
    // valorile de la 1 la 100. Sa se afiseze progresul in consola pe tot parcursul.

    public int[] getArrayToHundred() {

        int[] myArray = new int[100];


        for (int i = 1; i <= 100; i++) {

            myArray[i - 1] = i;

            System.out.println(myArray[i - 1]);

        }

        return myArray;

    }
    //3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol,
    // si sa il returneze populat cu toate valorile pare de la 1 la 100.
    // Apelati metoda in main() pentru a verifica daca functioneaza

    public int[] getEvenArrayToHundred(int[] evenArray) {

        int j = 0;


        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {

                evenArray[j] = i;

                j++;

            }

        }

        return evenArray;

    }
    //    4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.

//    Metoda sa calculeze si sa returneze media numerelor din array.


    public float getAverageArray(int[] myArray) {

        float sum = 0;

        for (int i = 0; i < myArray.length; i++) {

            sum += myArray[i];

        }

        return (sum / myArray.length);

    }


//    5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de tip String.

//    Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit,
//    iar daca da sa returneze true iar daca nu, sa returneze false.


    public boolean checkInArray(String[] arrString, String input) {


        for (int i = 0; i < arrString.length; i++) {

            if (arrString[i].equals(input)) {

                return true;

            }

        }

        return false;

    }


//    6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.

//    Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numarul.


    public int getPositionInArray(int[] Numbers, int nr) {

        for (int i = 0; i < Numbers.length; i++) {

            if (Numbers[i] == nr) {

                return i;

            }

        }

        return 0;

    }


//    7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:


    public void drawLines() {

        char[] line = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',};


        for (int i = 0; i <= 10; i++) {

            System.out.println(line);

        }

    }


//    8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.

//    Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar.


    public int[] removeNrFromArray(int[] myArray, int nr) {

        int[] secondArray = new int[myArray.length];

        int j = 0;

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] == nr)

                continue;

            secondArray[j++] = myArray[i];

        }

        int[] finArray = new int[j];


        for (int i = 0; i < j; i++)

            finArray[i] = secondArray[i];

        return finArray;

    }


//    9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.


    public int getSecondSmallestNrInArray(int[] myArray) {


        int temporary = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    temporary = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temporary;
                }
            }
        }
        return myArray[1];
    }


//    10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.

//    Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.


    public int[] copyArray(int[] firstArray, int[] emptyArray) {


        for (int i = 0, j = 0; i < firstArray.length; i++) {

            emptyArray[j] = firstArray[i];

            j++;

        }

        return emptyArray;

    }*/
    //1.Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista,

    // fiecare pe rand nou.


    public void printList(List<Integer> myList) {

        for (int i = 0; i < myList.size(); i++) {

            System.out.println(myList.get(i));

        }

    }

    //2.Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,

    // si celalalt un numar (real sau intreg).

    // Metoda sa adauge numarul primit ca si parametru la final de lista.


    public void addNumberToList(List<Integer> myList, int number) {

        myList.add(number);

    }

    //3.Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un

    // numar intreg.

    // Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou,

    // pornind de la numarul intreg primit ca si parametru.


    public void printListByIndex(List<Integer> myList, int position) {

        for (int i = position; i < myList.size(); i++) {

            System.out.println(myList.get(i));

        }

    }

    //4.Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista,

    // dar invers(de la capat la inceput).

    public void printListReversed(List<Integer> myList) {

        for (int i = myList.size() - 1; i >= 0; i--) {

            System.out.println(myList.get(i));

        }

    }

    //5.Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg,

    // si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip intreg

    // reprezinta pozitia la care sa fie pus acel String.

    public void addStringToMyList(List<String> myList, int index, String text) {

        myList.add(index, text);

    }

    //6.Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista, iar metoda

    // sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.

    public void addNumbertoFirstIndex(List<Integer> myList, int number) {

        myList.add(0, number);

    }

    //7.Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista,

    // si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).

    public void printListIndexAndElements(List<Integer> myList) {

        for (int i = 0; i < myList.size(); i++)

            System.out.println("Index " + i + " are elementul " + myList.get(i));

    }

    ////8.Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

    public int getBiggestValueFromList(List<Integer> myList) {

        int biggest = myList.get(0);

        for (int i = 0; i < myList.size(); i++) {

            if (myList.get(i) > biggest) {

                biggest = myList.get(i);


            }
        }
    }
}
























