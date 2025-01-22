import java.util.HashSet;

public class Activity {

    public String activityName;
    public String activityDescription;
    public double activityCost;
    public int activityCapacity;
    public HashSet<Passenger> activityParticipants;

    public Activity(String activityName, String activityDescription, double activityCost, int activityCapacity){
        this.activityName = activityName;
        this.activityDescription = activityDescription;
        this.activityCost = activityCost;
        this.activityCapacity = activityCapacity;
        this.activityParticipants = new HashSet<Passenger>();
    }

    public String getActivityName(){
        return activityName;
    }

    public void setActivityName(String activityName){
        this.activityName = activityName;
    }

    public void addPassenger(Passenger p){
        if (activityParticipants.size() < activityCapacity){
            activityParticipants.add(p);
        }
    }

    public boolean checkRegistration(Passenger p){
        return activityParticipants.contains(p);
    }

    public void printDetails(){
        System.out.println("Activity Name: " + activityName);
        System.out.println("Activity Description: " + activityDescription);
        System.out.println("Activity Cost: " + activityCost);
        System.out.println("Activity Capacity: " + activityCapacity);
    }

    public double calculateCost(Passenger p){
        if(p.getPassengerType().equals("VIP")){
            return activityCost * 0;
        } else if(p.getPassengerType().equals("Senior")){
            return activityCost * 0.9;
        }
        else return activityCost;

    }

    public String signUp(Passenger p){
        if (this.checkRegistration(p)){
            return "You are already registered for this activity";
        } else {
            if (this.activityParticipants.size() < this.activityCapacity ){
                if(p.getBalance() < this.calculateCost(p)){
                    return "You do not have enough balance to register for this activity";
                }
                else {
                    this.activityParticipants.add(p);
                    return "You have successfully registered for the activity";
                }

            } else {
                return "The activity is full";
            }
        }

    }

    public String toString() {
        return "Activity Name: " + activityName + "\n" + "Activity Description: " + activityDescription + "\n" + "Activity Cost: " + activityCost + "\n" + "Activity Capacity: " + activityCapacity;
    }
}
