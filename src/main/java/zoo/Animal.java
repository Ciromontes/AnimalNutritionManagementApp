package zoo;

public class Animal implements IAnimal {
    private String name;
    private String species;
    private int age;
    private String sex;
    private double weight;
    private String healthStatus;
    private IAnimalProfile profile;

    public Animal(String name, String species, int age, String sex, double weight, String healthStatus) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.healthStatus = healthStatus;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSpecies() {
        return null;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public String getSex() {
        return null;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public String getHealthStatus() {
        return null;
    }

    // Implement all other interface methods (getters, setters, etc.)

    @Override
    public IAnimalProfile getProfile() {
        return profile;
    }

    @Override
    public void setProfile(IAnimalProfile profile) {
        this.profile = profile;
    }
}