import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Adopter adopter = new Adopter(300);
        Date expirationDate = new Date(2023, 12, 30);
        FoodForAnimals food = new FoodForAnimals("bones", 25, 12, expirationDate, true);
        RecreationalActivity activity = new RecreationalActivity("sleep");
        VeterinaryDoctor doctor = new VeterinaryDoctor("John", "dogsAndCats");
        Game game = new Game(adopter, doctor);

        PomeranianDog pomedog = new PomeranianDog(4, 7, 4, "bouns", "barking", "male", "black", 2, true, "Rex", 4, "washed", "thick");
        BritishCat britishcat = new BritishCat(5, 3, 6, "cat food", "sleep", "white", 3, "aggressive", "Kitty", 5, "showered", "Erica");
        DomesticDuck domesticduck = new DomesticDuck(4, 7, 5, "duck food", "swimming", false, "Donald", 6, "need sleep", 2);

        System.out.println();
    }
}
