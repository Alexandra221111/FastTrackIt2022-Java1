public class Main4 {

    /*8. Creati o metoda care sa primeasca un parametru de tip array de numere,
    populat cu valori, si un parametru de tip numar. Metoda sa verifice daca numarul
     exista in array, si daca da, sa returneze array-ul primit, fara acel numar.
     Apelati metoda in main() pentru a verifica daca functioneaza.
     */
     public float getAverageForArray(int[]myArray){

         float sum = 0;
         for (int i = 0; i< myArray.length; i++){
             sum+=myArray[i];
         }
         return sum/myArray.length;
     }

    public int getIndexForValue(int[] array, int value){
        for (int i = 0, i < array.length; i++){
            if (array[i] == value) {
                return i ;

            }

        }
        return -1;
    }


        }
    }

