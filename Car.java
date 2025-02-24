import java.util.ArrayList;

public class Car {
    private int destination;
    private int currentLocation;
    private boolean direction;
    private ArrayList<Person>passengers;

    public Car(int myDestination, int start){
        destination = myDestination;
        currentLocation = start;
        direction = destination > currentLocation;
        passengers = new ArrayList<Person>();
    }

    public String toString(){
        return "Destination: "+destination+" Going right? "+direction+" Passengers: "+passengers+"";
    }
    public void addPassenger(Person p){
        if(passengers.size()>= 3){
            System.out.println("Error: No room!");
        }else{
        passengers.add(p);
        }
    }
    public boolean hasRoom(){
        return passengers.size() < 3;
    }
}
