import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Pluto", 7, 9, 5, 9, "ChickenDogFood", "walks");
        Adopter adopter = new Adopter("Irina", 500);
        Date expirationDate = new Date(2023, 12, 30);
        FoodForAnimals food = new FoodForAnimals("bones", 25, 12, expirationDate, true);
        RecreationalActivity activity = new RecreationalActivity("sleep");
        VeterinaryDoctor doctor = new VeterinaryDoctor("John", "dogsAndCats");
        Game game = new Game(adopter, animal, doctor);

        PomeranianDog pomedog = new PomeranianDog("Rex", 6, 10, 7, 3, "bones", "barking", "Erica", "male", "black", 3.5F, false, "to be loved", "thick");
        BritishCat britishcat = new BritishCat("Kitty", 4, 5, 7, 8, "catfood", "lasergame", "white", 3, "aggressive", "showered every evening", "Daniela");
        DomesticDuck domesticduck = new DomesticDuck("Donald", 5, 3, 6, 4, "cereals", "swimming", "natural", (int) 1.22, "food frequently", 5);
        
    }
}
