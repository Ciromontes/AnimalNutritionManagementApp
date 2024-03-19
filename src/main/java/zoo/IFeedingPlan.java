package zoo;

import zoo.IAnimal;

import java.util.List;

public interface IFeedingPlan {
    public IAnimal getAnimal();
    public List<IFood> getMeals();
    public void addMeal(IFood food);
    public void removeMeal(IFood food);
    public Nutrition calculateNutritionalValue(); // Assuming Nutrition class
    public boolean verifyNutritionalRequirements(); // Needs implementation based on animal profile
}