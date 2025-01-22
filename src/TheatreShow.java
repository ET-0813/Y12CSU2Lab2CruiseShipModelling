import java.util.ArrayList;

public class TheatreShow extends Activity {

    private ArrayList<Star> stars;

    public TheatreShow(String activityName, String activityDescription, double activityCost, int activityCapacity, ArrayList<Star> stars){
        super(activityName, activityDescription, activityCost, activityCapacity);
        this.stars = stars;
    }

    public ArrayList<Star> getStars(){
        return stars;
    }

    public void setStars(ArrayList<Star> stars){
        this.stars = stars;
    }

    public String toString(){
        return super.toString() + "\n" + "Stars: " + stars;
    }

}
