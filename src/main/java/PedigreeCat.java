public class PedigreeCat extends Cat {
    private String breed;

    public PedigreeCat(String name, int age, String owner, String breed) {
        super(name, age, owner);
        this.breed = breed;
    }


    public String toString() {
        return "The cat " + getName() + " is very beautiful, although she is now " + getAge() +
               ", she belongs to the breed " + breed + ", and her owner " + getOwner() + " is very proud of her.";
    }

    // getters/setters
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
