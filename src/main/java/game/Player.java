package game;

import java.util.Arrays;

public class Player extends Human {
    public Backpack backpack;

    public class Backpack {
        private String[] things;
        private int size;
        private boolean isEmpty;

        public Backpack() {
            size = 0;
            isEmpty = true;
            things = new String[size];
        }

        private void packThing(String thing) {
            things = Arrays.copyOf(things,++size);
            things[size - 1] = thing;
            isEmpty = false;
        }

        public String toString() {
            return isEmpty ? "the backpack is empty" : Arrays.toString(things) + " in the backpack" ;
        }
    }

    public Player(String name) {
        super(name);
        backpack = new Backpack();
    }


    public void take(String thing) {
        backpack.packThing(thing);
    }
}