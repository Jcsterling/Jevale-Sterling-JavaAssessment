import java.util.ArrayList;

public class Compass {

    int playerDisplacement = 5000;

    ArrayList<Direction>directions;

    public Compass(){

        directions = new ArrayList<>();
    }

    public void addDirection (Direction d){
        this.directions.add(d);
    }

    public void clearDirections(){
        directions.clear();
    }

    public int distanceFromTreasur(Direction d){
             playerDisplacement += d.displacement();
        return playerDisplacement;
    }

    public int getPlayerDisplacement(){
        return playerDisplacement;
    }
    public void displayJourney() {

        for (Direction d : directions) {
            System.out.println(d.toString());
        }
    }




}