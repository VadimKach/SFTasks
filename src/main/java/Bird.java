public class Bird {
    private String type;
    private String[] continents;
    private int population;


    public Bird(String type, String[] continents, int population) {
        this.type = type;
        this.continents = new String[continents.length];
        this.population = population;
    }
}
