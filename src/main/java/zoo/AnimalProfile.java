package zoo;

import zoo.Animal;

public class AnimalProfile implements IAnimalProfile {
    private Animal animal;
    private String dietaryNeeds;
    private String medicalHistory;

    public AnimalProfile(Animal animal, String dietaryNeeds, String medicalHistory) {
        this.animal = animal;
        this.dietaryNeeds = dietaryNeeds;
        this.medicalHistory = medicalHistory;
    }

    @Override
    public Animal getAnimal() {
        return animal;
    }

    // Implement all other interface methods (getters, setters, etc.)
}