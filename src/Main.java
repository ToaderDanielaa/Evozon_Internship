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

    public static void main(String[] args) {

        Display();
        System.out.println(Sum(3, 5));
        System.out.println(Div(10, 3));
        Act();

    }
}
