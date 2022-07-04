public class Pigeon extends Bird {
    private int hunger;


    public Pigeon(String[] continents, int population, int hunger) {
        super("pigeon", continents, population);
        this.hunger = hunger;
    }


    public void askForSeeds() {
        hunger = (hunger < 7) ? 0 : hunger - 7;
    }

    public void sleep() {
        hunger += 3;
    }


    public int getHunger(){
        return hunger;
    }
}
