public class VeterinaryDoctor {
    private String name;
    private String specialization;

    public VeterinaryDoctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void treat(String treatment, String treatment2, Animal pet) {
        System.out.println("The animal " + pet.getName() + " was treated with " + treatment + " and" + treatment2);
        pet.setHealtyLevel(10);
        pet.setMood(10);
        System.out.println(pet.getName() + " it's healty and happy now, but a little scared of vet " + getName());
    }
}
