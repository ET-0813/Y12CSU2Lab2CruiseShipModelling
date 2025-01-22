import java.util.ArrayList;

public class Destination {

    private String destinationName;
    private ArrayList<Activity> activityList;

    public Destination(String destinationName, ArrayList<Activity> activityList){
        this.destinationName = destinationName;
        this.activityList = activityList;
    }

    public String getDestinationName(){
        return destinationName;
    }

    public void setDestinationName(String destinationName){
        this.destinationName = destinationName;
    }

    public ArrayList<Activity> getActivityList(){
        return activityList;
    }

    public void setActivityList(ArrayList<Activity> activityList){
        this.activityList = activityList;
    }

    public void addActivity(Activity activity){
        activityList.add(activity);
    }

    public void removeActivity(Activity activity){
        activityList.remove(activity);
    }

    public String getAvailableActivities(){
        String activities = "";
        for (Activity a : activityList){
            activities += a.getActivityName() + "\n";
        }
        return activities;
    }

    public String toString(){
        return "Destination Name: " + destinationName + "\n" + "Activities: \n" + getAvailableActivities();
    }

}
