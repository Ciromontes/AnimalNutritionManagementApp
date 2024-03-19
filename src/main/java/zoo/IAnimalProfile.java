package zoo;

import zoo.IAnimal;

public interface IAnimalProfile {
    public IAnimal getAnimal();
    public String getDietaryNeeds();
    public String getMedicalHistory();
    public void setDietaryNeeds(String dietaryNeeds);
    public void setMedicalHistory(String medicalHistory);
}