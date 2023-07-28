public class Game {
    private Adopter adopter;
    private Animal animal;
    private VeterinaryDoctor doctor;

    public Game(Adopter adopter, Animal animal, VeterinaryDoctor doctor) {
        this.adopter = adopter;
        this.animal = animal;
        this.doctor = doctor;
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public VeterinaryDoctor getDoctor() {
        return doctor;
    }

    public void setDoctor(VeterinaryDoctor doctor) {
        this.doctor = doctor;
    }
}
