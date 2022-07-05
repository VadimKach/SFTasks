package m8t2;

public class Orc implements Playble {

    @Override
    public String move() {
        return "run";
    }

    @Override
    public String attack() {
        return "ax blow";
    }

    @Override
    public String defence() {
        return "block";
    }
}
