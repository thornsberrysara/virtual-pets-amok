package pets_amok;

public interface Organic {
    public void feed();
    public void water();
    public void cleanWaste();

    public int getHunger();
    public int getThirst();
    public int amountOfWaste();

    void feedOrganicPets();
    void waterOrganicPets();
    void cleanCage();
}