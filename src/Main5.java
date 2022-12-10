public class Main5 {
    //1. Creati o metoda in clasa LogicalOp, care sa primeasca un
    // numar ca si parametru. Metoda sa verifice numarul primit,
    // si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.


    public void untilHundred(int b) {

        for (int i = b; i <= 100; i++) {

            System.out.println(i);
        }


    }

    //2. Creati o metoda in clasa LogicalOp, care sa primeasca
    // un numar ca si parametru. Metoda sa verifice numrul primit,
    // si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.


    public void untilMinusHundred(int c) {

        for (int i = c; i >= -100; i--) {

            System.out.println(i);
        }
    }


}
