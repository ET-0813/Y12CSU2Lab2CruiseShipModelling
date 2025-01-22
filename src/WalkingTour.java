public class WalkingTour extends Activity{

    private double distance;

    public WalkingTour(String activityName, String activityDescription, double activityCost, int activityCapacity) {
        super(activityName, activityDescription, activityCost, activityCapacity);
        this.distance = distance;
    }

    public double getDistance(){
        return distance;
    }

    public void setDistance(double distance){
        this.distance = distance;
    }

    public String toString(){
        return super.toString() + "\n" + "Distance: " + distance;
    }


}
