public class LogicalOp {
    //3. In clasa LogicalOp, creati o metoda de tip int, care sa se numeasca checkBiggerNumber(),
    //si sa primeasca doua int-uri ca si parametrii. Folosind if - else,
    //verificati in interiorul metode care numar este mai mare, dintre cele doua valori care va vin ca si parametrii, si returnati numarul mai mare.
    public int checkBiggerNumber(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    //4. Creati o metoda de tip String, care sa primeasca un parametru de tip String.
    // Verificati daca textul ce vine ca si parametru este egal cu “Evozon”.
    // Daca da, atunci metoda sa returneze “Learning text comparison”.
    // Daca nu, atunci metoda sa returneze “Got to try some more”.
    public String Compare(String nume) {
        if (nume.equals("Evozon"))
            return "Learning text comparison";
        else
            return "Got to try some more";
    }

    //5. Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de
    // tip int. Daca textul primit ca si parametru este egal cu “Evozon”, si numarul primit ca si parametru
    // este mai mic sau egal cu 3, returnati textul si numarul, in ordinea asta. Daca textul nu este
    // “Evozon” si numarul este mai mare sau egal cu 4, returnati numarul si textul, in ordinea asta.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public String compareStringInt(String var, int a) {

        if (var.equals("Evozon") && a <= 3)
            return var + a;
        else if (!var.equals("Evozon") && a >= 4)
            return a + var;
        return var;
    }

    //6. Creati o metoda de tip String, care sa primeasca un parametru de tip int.
    // Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze
    // “The amount of snow this winter was(cm): “ si numarul.
    // Daca nu, sa returneze “The forecast snow is(cm):” si numarul.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public String winter(int a) {
        if (a > 8 || a == 6)
            return "The amount of snow this winter was(cm): " + a;
        else
            return "The forecast snow is(cm): " + a;
    }

    //7. Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
    //Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
    // Daca numarul este egal cu 4, returnati “The number is equal to 4”, iar daca numarul este mai mic
    // de 3 returnati “The number is lower than 3”. Apelati metoda in main() pentru a verifica
    // daca functioneaza.
    public String numberEqual(int number) {
        if (number > 3 && number != 4)
            return "The number is greater than 3 and not equal to 4";
        else if (number == 4)
            return "The number is equal to 4";
        else
            return "The number is lower than 3";
    }

    //8.Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
    // Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul
    // "The number is:  x !" unde x trebuie sa reprezinte numarul apasat.
    // Pentru exemplul de fata sa nu se foloseasca concatenarea stringului
    // "The number is:" cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru
    // fiecare caz din Switch-Case. Apelati metoda in main() pentru a verifica daca functioneaza.
    public void showNumber(int n) {
        switch (n) {
            case 0:
                System.out.println("The number in: 0");
                break;
            case 1:
                System.out.println("The number in: 1");
                break;
            case 2:
                System.out.println("The number in: 2");
                break;
            case 3:
                System.out.println("The number in: 3");
                break;
            case 4:
                System.out.println("The number in: 4");
                break;
            case 5:
                System.out.println("The number in: 5");
                break;
            case 6:
                System.out.println("The number in: 6");
                break;
            case 7:
                System.out.println("The number in: 7");
                break;
            case 8:
                System.out.println("The number in: 8");
                break;
            case 9:
                System.out.println("The number in: 9");
                break;
        }
    }

    //9. Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru
    // un numar, si sa returneze adevarat sau fals. Daca numarul e par sa returneze true iar daca e impar
    // sa returnese false. Apelati metoda in main() pentru a verifica daca functioneaza.
    public boolean isNumberEven(int n) {
        return n % 2 == 0;
    }

    //10. Creati o metoda care sa se numeasca isEligibleToVote. Metoda sa primeasca ca si parametru un
    // numar, care sa reprezinte varsta, iar metoda sa iti zica daca daca persoana are drept de vot.
    // Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false. Apelati metoda in
    // main() pentru a verifica daca functioneaza.
    public boolean isEligibleToVote(int age) {
        return age >= 18;
    }

    //Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public int bigNumber(int a, int b, int c) {
        if (a > b)
            if (c > a)
                return c;
            else
                return a;
        else if (c > b)
            return c;
        else
            return b;
    }

    //assignment for-loops
    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void parNumber() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(" " + i);
        }
    }

    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void imparNumber() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.println(" " + i);
        }
    }

    //7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    // iar la final sa returneze rezultatul. Apelati metoda in clasa Main, metoda main() pentru a
    // verifica daca functioneaza.
    public int addNumbers(int n) {
        int s = n;
        for (int i = n + 1; i <= 100; i++)
            s = s + i;
        return s;
    }

    //8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
// Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, si sa calculeze
// media numerelor. La final, metoda sa returneze media. Apelati metoda in clasa Main, metoda main() pentru a
// verifica daca functioneaza.
    public float averageNumber(int n) {
        int s = n;
        float avg;
        for (int i = n + 1; i <= 100; i++)
            s = s + i;
        avg = (float) s / (100 - n + 1);
        return avg;
    }

    //9.Creati o metoda in clasa LogicalOp care sa afiseze urmatorul tipar
    public void tipar(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--)
                System.out.print('*');
            System.out.println();
        }
    }

    //assignment while-loop

    //8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor
    // divizibile cu 7, din acel interval. Apelati metoda in clasa Main, metoda main() pentru a verifica
    // daca functioneaza.
    public float avgNumber(int a, int b) {
        float count = 0, sum = 0;
        while (a <= b) {
            if (a % 7 == 0) {
                count++;
                sum = sum + a;
            }
            a++;
        }
        return sum / count;
    }

    //9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.
    public void fibonacci() {
        int n1 = 1, n2 = 1, i = 3, s = 1;
        System.out.printf(n1 + " " + n1);
        while (i <= 20) {
            s = n1 + n2;
            System.out.printf(" %d ", s);
            n1 = n2;
            n2 = s;
            i++;
        }
    }

    //
    public void CozaLozaWoza() {
        int i = 1;
        while (i <= 110) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0)
                System.out.print(" CozaLozaWoza ");
            else if (i % 5 == 0 && i % 7 == 0)
                System.out.print(" WozaLoza ");
            else if (i % 3 == 0 && i % 7 == 0)
                System.out.print(" CozaWoza ");
            else if (i % 3 == 0 && i % 5 == 0)
                System.out.print(" CozaLoza ");
            else if (i % 7 == 0)
                System.out.print(" Woza ");
            else if (i % 5 == 0)
                System.out.print(" Loza ");
            else if (i % 3 == 0)
                System.out.print(" Coza ");
            else
                System.out.printf(" %d ", i);
            i++;
        }
    }

}

