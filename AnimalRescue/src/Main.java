import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Adopter adopter = new Adopter("Maria", 7, true, "red", 450);
        Adopter adopter2 = new Adopter("John", 45, true, "black", 300);
        Date expirationDate = new Date(2023, 12, 30);
        FoodForAnimals food = new FoodForAnimals("diet food", 25, 12, expirationDate, true);
        RecreationalActivity activity = new RecreationalActivity("sleep");
        VeterinaryDoctor doctor = new VeterinaryDoctor("John", "dogsAndCats");
        Game game = new Game(adopter, doctor);
        Shelter shelter = new Shelter("Happy tails");
        PomeranianDog pomedog = new PomeranianDog("Rex", 3, 2, 3, "dog food", "running", "male", "brown", 4, false, 5, "to sleep", "thick");


        System.out.printf("The story is about a little girl named %s with the age of %d with %s hair", adopter.getName(), adopter.getAge(), adopter.getHairColor());
        shelter.Enters(adopter, adopter2);
        adopter.adopt(pomedog);
        adopter.feed(pomedog, "dog food");
        System.out.print(adopter.getName() + " took" + pomedog.getName() + " to the vet.");
        doctor.treat("vaccination", "deparazitation", pomedog);
        adopter.feed(pomedog, "bones");
        adopter.feed(pomedog, "diet food");
        pomedog.Activity("running");
        pomedog.Sleep();
        pomedog.Activity("playing ball");
        pomedog.Activity("running");
        adopter.feed(pomedog, "Diet food");
        pomedog.Sleep();

    }
}
