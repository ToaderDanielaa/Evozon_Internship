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
    }
}