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
        return "Destination: "+destination+"| Going right? "+direction+"| Passengers: "+passengers+"";
    }


    /// tries to add Passengers to the car  checks if there is room
    public void addPassenger(Person p){
        if(passengers.size()>= 3){
            System.out.println("Error: No room!");
        }else{
        passengers.add(p);
        }
    }

    public int numofPassengers(){
        return passengers.size();
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

    ///unload 1 person and checks to see if either the car or the passenger has reached their destination
    public Person unload(){
        for (int i = 0;i<passengers.size();i++){
            if(passengers.get(i)!= null){
            if(passengers.get(i).getDestination() == currentLocation || destination == currentLocation){
                return passengers.remove(i);
            }
        }
    }
        return null;
    }
    
    //moves car
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
