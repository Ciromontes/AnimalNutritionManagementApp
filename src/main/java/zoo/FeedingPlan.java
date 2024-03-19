package zoo;

import zoo.Animal;

import java.util.ArrayList;
import java.util.List;

public class FeedingPlan implements IFeedingPlan {
    private Animal animal;
    private List<IFood> meals;

    public FeedingPlan(Animal animal) {
        this.animal = animal;
        this.meals = new ArrayList<>();
    }

    @Override
    public IAnimal getAnimal() {
        return animal;
    }

    @Override
    public List<IFood> getMeals() {
        return meals;
    }

    @Override
    public void addMeal(IFood food) {
        this.meals.add(food);
    }

    @Override
    public void removeMeal(IFood food) {
        this.meals.remove(food);
    }

    @Override
    public Nutrition calculateNutritionalValue() {
        // Implement logic to calculate total nutritional value from meals
        Nutrition totalNutrition = new Nutrition(0, 0, 0); // Example initialization
        for (IFood food : meals) {
            totalNutrition.add(food.getNutritionalValue());
        }
        return totalNutrition;
    }

    @Override
    public boolean verifyNutritionalRequirements() {
        // Implement logic to compare calculated nutrition with animal profile needs
        return true; // Placeholder, needs actual implementation
    }
}