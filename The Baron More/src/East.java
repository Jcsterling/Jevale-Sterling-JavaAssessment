public class East extends Direction {
    private int heartRate;

    public East( int heartRate){
        super("a bit chilly");

        this.heartRate =  heartRate;
    }

    @Override
    public String toString() {
        return "Well done \n" + heartRate+ "BPM means that you are about to die\n\n";
    }

    @Override
    public int displacement() {
        return 250;
    }
}
