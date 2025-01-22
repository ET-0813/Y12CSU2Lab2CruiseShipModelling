import java.util.ArrayList;
import java.util.HashSet;

public class CruiseShip {

    private String shipName;
    private int capacity;
    private static ArrayList<Destination> itinerary;
    private HashSet<Passenger> passengerList;

    public CruiseShip(String shipName, int capacity, ArrayList<Destination> itinerary) {
        this.shipName = shipName;
        this.capacity = capacity;
        this.itinerary = itinerary;
        this.passengerList = new HashSet<Passenger>();
    }

    public String getShipName(){
        return shipName;
    }

    public void setShipName(String shipName){
        this.shipName = shipName;
    }

    public void printItinerary(){
        for (int i = 0; i < itinerary.size(); i++){
            System.out.println(itinerary.get(i));
        }
    }

    public HashSet<Passenger> printPassengers(){
        return passengerList;
    }

    public String printPassengerInfo(Passenger p){
        return p.getPassengerName() + " " + p.getPassengerNumber() + " " + p.getPassengerType() + " " + p.getBalance();
    }

    public void addPassenger(Passenger p){
        if (passengerList.size() < capacity){
            passengerList.add(p);
        }
    }

    public void removePassenger(Passenger p){
        passengerList.remove(p);
    }

    public void addDestination(Destination d){
        itinerary.add(d);
    }

    public void removeDestination(Destination d){
        itinerary.remove(d);
    }

    public ArrayList<Destination> getItinerary(){
        return itinerary;
    }



    public String toString(){
        return shipName + " with capacity " + capacity;
    }

}
