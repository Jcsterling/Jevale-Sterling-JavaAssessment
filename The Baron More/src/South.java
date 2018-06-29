public class South extends Direction {

    private String weapon;

    public South(String weapon){
        super("its icy around here" );

        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "you chose a " + weapon + "to fight the london Road men in you path.\n\n";
    }

    @Override
    public int displacement() {
        return -600;
    }
}
