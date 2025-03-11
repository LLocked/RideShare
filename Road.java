import java.util.*;
public class Road {
    
    private Station[]stations;
    private ArrayList<Car> fleet;
    private static final int NUMSTATIONS = 32;


    //////Constructor

    public Road(){
        stations = new Station[NUMSTATIONS];
        for(int i = 0;i<stations.length; i++){
            stations[i] = new Station(i);
        }
        fleet = new ArrayList<Car>();
    }

    //////Functions
    

            //////Creates Stations
    public void populateStations(int numPeople){
        for(int i = 0; i<numPeople;i++){
            int start = (int)(Math.random()*NUMSTATIONS);
            int stop = (int)(Math.random()*NUMSTATIONS);
            stations[start].addPerson(new Person(stop,start));
        }
    }
            //////Creates Cars
    public void populateCars(int numCars){
        for(int i = 0; i <numCars; i++){
            int start = (int)(Math.random()*NUMSTATIONS);
            int stop = (int)(Math.random()*NUMSTATIONS);
            fleet.add(new Car(stop, start));
        }
    }

            //////Returns String of stations + Cars
    public String toString(){
        String s = "";
        for (Station st : stations){
            s += st.toString();
        }
        s +="Cars:\n";
        for(Car c: fleet){
            s +=c.toString();
            s+= "\n";
        }
        return s;
    }   

            ////// MOVES EVERYTHING
    public void move(){
        for(Car c : fleet){
            Person p = c.unload();
            if(p!= null){
                int location = c.getLocation();
                stations[location].addPerson(p);
            } else{
                break;
            }
        }
        for(Car c : fleet){
            c.move();
        }
        for(Car c: fleet){
            loadSpecificCar(c);
        }
    }

    public void loadSpecificCar(Car c){
        Station matching = stations[c.getLocation()];
        if(c.getDirection()){
            c.addPassenger(matching.nextRight());
        }else if(!c.getDirection()){
            c.addPassenger(matching.nextLeft());
        }
    }
}
