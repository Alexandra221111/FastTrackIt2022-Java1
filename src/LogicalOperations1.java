public class LogicalOperations1 {
    //1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
// Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
// pornind de la numarul primit ca si parametru.
    LogicalOperations1 logicalOp1 = new LogicalOperations1();

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

        int x= 20;

        int z= 0;

        int y = 1;



        int i=1;

        while(i<=x)

        {

            System.out.print(z+" ");

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

}















