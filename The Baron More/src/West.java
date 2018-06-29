public class West extends Direction {
    private int restTime; //you rested for __ hours to regain energy

    @Override
    public String toString() {
        return "after " + restTime + " hours sleep, you are now a wizard\n\n";
    }

    public West(int restTime){
        super("no wind");

        this.restTime = restTime;
    }

    @Override
    public int displacement() {
        return -10;
    }
}
