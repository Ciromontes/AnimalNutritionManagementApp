package zoo;

public interface IAnimal {
    public String getName();
    public String getSpecies();
    public int getAge();
    public String getSex();
    public double getWeight();
    public String getHealthStatus();
    public IAnimalProfile getProfile();
    public void setProfile(IAnimalProfile profile);
}