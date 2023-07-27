import java.util.List;
import java.util.ArrayList;
public class Calculator {
    private Object list;

    public int adunare(int a, int b) {
        int rez;
        rez = a + b;
        return rez;
    }

    public int scadere(int a, int b) {
        int rez;
        rez = a - b;
        return rez;
    }

    public int inmultire(int a, int b) {
        int rez;
        rez = a * b;
        return rez;
    }

    public float impartire(int a, int b) {
        float rez;
        rez = (float) a / b;
        return rez;
    }

    //assignment arrays
    //7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
    public void grid() {
        String[] grila = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
        for (String i : grila) {
            for (String j : grila)
                System.out.print(grila[0]);
            System.out.println();
        }
    }

    //8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori,
    // si un parametru de tip numar. Metoda sa verifice daca numarul exista in array, si daca da, sa
    // returneze array-ul primit, fara acel numar. Apelati metoda in main() pentru a verifica daca
    // functioneaza.
    public int[] foundNumber(int[] myNums, int n) {
        int[] copy = new int[myNums.length];
        for (int i = 0; i < myNums.length; i++) {
            if (myNums[i] == n)
                continue;
            copy[i] = myNums[i];
        }
        return copy;
    }

    //9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din
    // array. Apelati metoda in main() pentru a verifica daca functioneaza.
    public int secondMinFromArray(int[] array) {
        int min = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < min) {
                secondmin = min;
                min = i;
            } else if (i < secondmin && i != min)
                secondmin = i;
        }
        return min;
    }

    //10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol. Metoda sa copieze toate valorile din primul array,
    // parcurgandu-l, in cel de-al doilea. Apelati metoda in main() pentru a verifica daca functioneaza.
    public void copyArray(int[] array, int[] copyarray) {
        copyarray = new int[array.length];
        for (int i = 0; i < array.length; i++)
            copyarray[i] = array[i];
        for (int i = 0; i < copyarray.length; i++) {
            System.out.print(" " + copyarray[i]);
        }
    }


    //assignment-List
    //1.Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.
    public static void printList(List<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    //2.Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg).
    // Metoda sa adauge numarul primit ca si parametru la final de lista
    public static void addNumberToList(List<Integer> list, int number) {
        list.add(number);
    }

    //3.Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un numar intreg.
    // Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.
    public static void printValuesFromIndex(List<Integer> list, int n) {
        for (int i = n; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    //4.Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput).
    public static void printListReversed(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    //5.Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String.
    // Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.
    public static void addStringAtPosition(List<String> list, int p, String val) {
        list.add(p, val);
    }

    //6.Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru si sa il adauge
    // pe prima pozitie din lista.
    public static void addValueAtFirstPosition(List<String> list, String val) {
        list.add(0, val);
    }

    //7.Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista, si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).
    public static void printValuesAndPositions(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int nr = list.get(i);
            System.out.println("Pe pozitia " + (i + 1) + " valoarea este " + nr);
        }
    }

    //8.Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.
    public static int maxNumber(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int currentNr = list.get(i);
            if (currentNr > max) {
                max = currentNr;
            }
        }
        return max;
    }
}