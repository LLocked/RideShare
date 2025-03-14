public class Person{
    //fields
    private int destination;
    private boolean direction; //true right ;left false
    private int startLocation;
    //contructors
    public Person(int myDestination,int myStart){
        destination = myDestination;
        startLocation = myStart;
        direction = destination> startLocation;
    }

    public int getDestination(){
        return destination;
    }
    
    public boolean getDirection(){
        return direction;
    }

    public int getStart(){
        return startLocation;
    }

    public String toString(){
        return super.toString() + " Start: " + startLocation + " Destination: " + destination;
        }

}