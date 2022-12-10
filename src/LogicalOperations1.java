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

            logicalOp1.numbersBetween(x,y);
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

            logicalOp1.numbersBetween(a,b);
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

        for(int i = g; i<= 100;i++){

            sum += i;

        }

        return sum;

    }
    //8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100,
    // pornind de la numarul primit ca si parametru, si sa calculeze media numerelor.

    public int returnAverage(int b) {

        int x = 0;

        int y= 0;

        for(int i = b; i<= 100;i++){

            x += i;

            y ++;

        }

        return x/y;

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

            }














