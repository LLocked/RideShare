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
    public int getLocation(){
        return currentLocation;
    }
    public boolean getDirection(){
        return direction;
    }
    public boolean hasRoom(){
        return passengers.size() < 3;
    }

    ///unload all people
    public Person unload(){
        for (int i = 0;i<passengers.size();i++){
            Person a  = passengers.get(i);
            if(a.getDestination() == currentLocation || destination == currentLocation){
                return passengers.remove(i);
            }
        }
        return null;
    }
    
    public void move(){
        if(currentLocation != destination){
            if(direction){
                currentLocation++;
            }else {
                currentLocation--;
            }
        }
    }
}
