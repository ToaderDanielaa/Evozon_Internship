public class Calculator {
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
        String[] grila = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-" };
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


}
