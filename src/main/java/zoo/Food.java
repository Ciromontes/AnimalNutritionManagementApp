package zoo;

public class Food implements IFood {
    private String name;
    private String foodType;
    private Nutrition nutritionalValue;

    public Food(String name, String foodType, Nutrition nutritionalValue) {
        this.name = name;
        this.foodType = foodType;
        this.nutritionalValue = nutritionalValue;
    }

    @Override
    public String getName() {
        return name;
    }

    // Implement all other interface methods (getters)
}
