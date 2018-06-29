public abstract class Direction {

    private String weatherCondition;


    public Direction(String weatherCondition){
        this.weatherCondition = weatherCondition;

    }

    public abstract int displacement();
}
