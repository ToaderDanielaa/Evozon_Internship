// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
    static void Display() {
        System.out.println("Hello, Daniela!");
    }

//2. Printati rezultatul sumei a doua numere(orice numere)

    public static int Sum(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    //3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
    public static double Div(int a, double b) {
        double r;
        r = a / b;
        return r;
    }

    // 4. Printati rezultatul urmatoarelor operatiuni:
    public static void Act() {
        //a. -5 + 8 * 6
        int a = -5 + 8 * 6;
        System.out.println(a);

        //b. (55+9) % 9
        int b = (55 + 9) % 9;
        System.out.println(b);

        //c. 20 + -3*5 / 8
        double c = 20 + -3 * 5 / 8.00;
        System.out.println(c);

        //5 + 15 / 3 * 2 - 8 % 3
        double d = 5 + 15 / 3.00 * 2 - 8 % 3;
        System.out.println(d);
    }

    //2. Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.
    public static int adunare(int a, int b) {
        int rez;
        rez = a + b;
        return rez;
    }

    public static int scadere(int a, int b) {
        int rez;
        rez = a - b;
        return rez;
    }

    public static int inmultire(int a, int b) {
        int rez;
        rez = a * b;
        return rez;
    }

    public static float impartire(int a, int b) {
        float rez;
        rez = (float) a / b;
        return rez;
    }

    //3.Scrieti o metoda java, care sa afiseze urmatorul model
    public static void Model() {
        System.out.println(" +\"\"\"\"\"+                                                 \n" +
                "[| o o |]                                                \n" +
                " |  ^  |                                                 \n" +
                " | '-' |                                                 \n" +
                " +-----+");
    }

    //4.Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.
    public static float media(int a, int b, int c) {
        float rez;
        rez = (float) (a + b + c) / 3;
        return rez;
    }

    //5.Scrieti o metoda java, care sa returneze restul impartirii a doua numere
    public static int rest(int a, int b) {
        int rez;
        rez = a % b;
        return rez;
    }

    //6.Scrieti o metoda java, care sa primeasca ca si parametru un numar,
    // care sa reprezinte temperatura in Fahrenheit
    // si sa returneze temperatura in Celsius. Formula de calcul este: C = 5/9 * (F -32)
    public static float tempCelsius(int f) {
        float c;
        c = (float) 5 / 9 * (f - 32);
        return c;
    }

    //7.Scrieti o metoda java, care sa primeasca ca si parametru un numar real,
    // care sa reprezinte distanta in inch, si sa returneze distanta in metrii
    public static float distMetrii(float inch) {
        float metru;
        metru = (float) (inch * 25.4 / 1000);
        return metru;
    }

    //8.Scrieti o metoda java, care primeste distanta (in metrii) si
    // timpul (ca si 3 numere: ore, minute, secunde), si afiseaza viteza, in metrii pe secunda,
    // kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metrii)

    public static void viteza(float dist, int ora, int min, int sec) {
        float t = ora * 3600 + min * 60 + sec;

        float v1 = dist / t;
        System.out.println("Viteza in metrii pe secunda este: " + v1);

        float v2;
        v2 = (float) ((dist / 1000) / (t * 0.000277777778));
        System.out.println("Viteza in kilometrii pe ora este: " + v2);

        float v3;
        v3 = (float) ((dist / 1609) / (t * 0.000277777778));
        System.out.println("Viteza in mile pe ora este: " + v3);

    }

    //9.Scrieti un program care primeste ca input raza unui cerc si printeaza perimetrul si aria acelui cerc:
    public static void cerc(int r) {
        System.out.println("Perimetrul cercului este: " + 2 * 3.13 * r);
        System.out.println("Aria cercului este: " + 3.13 * r * r);
    }


    public static void main(String[] args) {

        // Display();//for assignment1
        // System.out.println(Sum(3, 5));//for assignment1
        //System.out.println(Div(10, 3));//for assignment1
        //Act();//for assignment1

        System.out.println("Rezultatul adunarii este: " + adunare(4, 5));
        System.out.println("Rezultatul scaderii este: " + scadere(20, 7));
        System.out.println("Rezultatul inmultirii este: " + inmultire(4, 5));
        System.out.println("Rezultatul impartirii este: " + impartire(6, 5));
        System.out.println("Modelul este: /n");
        Model();
        System.out.println("Media celor trei numere este: " + media(3, 3, 4));
        System.out.println("Restul impartirii este: " + rest(7, 4));
        System.out.println("Temperatura in Celsius este: " + tempCelsius(40));
        System.out.println("distanta din inch in metru este: " + distMetrii(40));

        System.out.println("Vitezele sunt: ");
        viteza(2600, 2, 28, 40);

        System.out.println("Cerc: ");
        cerc(4);

    }
}
