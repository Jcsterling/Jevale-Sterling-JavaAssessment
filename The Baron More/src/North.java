public class North extends Direction {

private String fruit;

public North(String fruit){
    super("its getting warmer");

    this.fruit = fruit;

}

    @Override
    public String toString() {
        return "You have eaten the fruit(s): "+fruit+"\nYou are now Vegan\n\n";
    }

    @Override
    public int displacement() {
        return 400;
    }
}
