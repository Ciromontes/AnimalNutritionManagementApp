package zoo;

public interface IFood {
    public String getName();
    public String getFoodType();
    public Nutrition getNutritionalValue(); // Assuming a Nutrition class for details
}