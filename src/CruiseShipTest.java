import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CruiseShipTest {

    private CruiseShip titanic;
    private Destination destination1, iceberg;
    private Activity activity1, activity2;
    private Passenger passenger1, passenger2, passenger3;
    private TheatreShow theatreShow;
    private WalkingTour walkingTour;
    private Star star1, star2;
    private ArrayList<Star> stars;

    @BeforeEach
    void setUp(){
        titanic = new CruiseShip("Titanic", 100, new ArrayList<Destination>());
        destination1 = new Destination("Japan", new ArrayList<Activity>());
        iceberg = new Destination("Iceberg", new ArrayList<Activity>());
        passenger1 = new Passenger("Ethan", 123456, "VIP", 1000);
        passenger2 = new Passenger("Nitu", 654321, "Senior", 1000);
        passenger3 = new Passenger("Theo", 987654, "Standard", 1000);
        theatreShow = new TheatreShow("Theatre Show", "A show that shows", 50, 100, new ArrayList<Star>());
        walkingTour = new WalkingTour("Walking Tour", "A tour on foot", 50, 100);
        star1 = new Star("Chris Helmsworth", "Thor");
        star2 = new Star("Robert", "Iron Man");
        stars = new ArrayList<Star>();
        stars.add(star1);
        stars.add(star2);
    }
    @AfterEach
    void tearDown() {
        titanic = null;
        destination1 = null;
        iceberg = null;
        passenger1 = null;
        passenger2 = null;
        passenger3 = null;
        theatreShow = null;
        walkingTour = null;
        star1 = null;
        star2 = null;
        stars = null;
    }

    @Test
    void testAddDestination() {
        titanic.addDestination(destination1);
        titanic.addDestination(iceberg);
        ArrayList<Destination> expected = new ArrayList<>();
        expected.add(destination1);
        expected.add(iceberg);
        assertEquals(expected, titanic.getItinerary());
    }



    @Test
    void testRemoveDestination(){
        titanic.addDestination(destination1);
        titanic.addDestination(iceberg);
        titanic.removeDestination(destination1);
        ArrayList<Destination> expected = new ArrayList<>();
        expected.add(iceberg);
        assertEquals(expected, titanic.getItinerary());
    }


    @Test
    void testAddPassenger(){
        titanic.addPassenger(passenger1);
        titanic.addPassenger(passenger2);
        titanic.addPassenger(passenger3);
        HashSet<Passenger> expected = new HashSet<>();
        expected.add(passenger1);
        expected.add(passenger2);
        expected.add(passenger3);
        assertEquals(expected, titanic.printPassengers());
    }

    @Test
    void testRemovePassenger(){
        titanic.addPassenger(passenger1);
        titanic.addPassenger(passenger2);
        titanic.addPassenger(passenger3);
        titanic.removePassenger(passenger1);
        HashSet<Passenger> expected = new HashSet<>();
        expected.add(passenger2);
        expected.add(passenger3);
        assertEquals(expected, titanic.printPassengers());
    }

    @Test
    void testAddActivity(){
        destination1.addActivity(theatreShow);
        destination1.addActivity(walkingTour);
        ArrayList<Activity> expected = new ArrayList<>();
        expected.add(theatreShow);
        expected.add(walkingTour);
        assertEquals(expected, destination1.getActivityList());
    }

    @Test
    void testRemoveActivity(){
        destination1.addActivity(theatreShow);
        destination1.addActivity(walkingTour);
        destination1.removeActivity(theatreShow);
        ArrayList<Activity> expected = new ArrayList<>();
        expected.add(walkingTour);
        assertEquals(expected, destination1.getActivityList());
    }

    @Test
    void  testGetAvailableActivities(){
        destination1.addActivity(theatreShow);
        destination1.addActivity(walkingTour);
        assertEquals("Theatre Show\nWalking Tour\n", destination1.getAvailableActivities());
    }

    @Test
    void testGetActivityList(){
        destination1.addActivity(theatreShow);
        destination1.addActivity(walkingTour);
        ArrayList<Activity> expected = new ArrayList<>();
        expected.add(theatreShow);
        expected.add(walkingTour);
        assertEquals(expected, destination1.getActivityList());
    }


    @Test
    void testGetDestinationName(){
        assertEquals("Japan", destination1.getDestinationName());
    }

    @Test
    void testSetDestinationName(){
        destination1.setDestinationName("China");
        assertEquals("China", destination1.getDestinationName());
    }

    @Test
    void testGetShipName(){
        assertEquals("Titanic", titanic.getShipName());
    }

    @Test
    void testSetShipName(){
        titanic.setShipName("Queen Mary");
        assertEquals("Queen Mary", titanic.getShipName());
    }


    @Test
    void testSetStars(){
        ArrayList<Star> newStars = new ArrayList<>();
        Star star3 = new Star("Tom", "Spiderman");
        newStars.add(star3);
        theatreShow.setStars(newStars);
        assertEquals(newStars, theatreShow.getStars());
    }

    @Test
    void testPrintPassengerInfo(){
        assertEquals("Ethan 123456 VIP 1000.0", titanic.printPassengerInfo(passenger1));
    }


    @Test
    void testCalculateCost(){
        assertEquals(0.0, theatreShow.calculateCost(passenger1));
        assertEquals(45.0, theatreShow.calculateCost(passenger2));
        assertEquals(50.0, theatreShow.calculateCost(passenger3));
    }

    @Test
    void testCheckRegistration(){
        theatreShow.addPassenger(passenger1);
        assertEquals(true, theatreShow.checkRegistration(passenger1));
        assertEquals(false, theatreShow.checkRegistration(passenger2));
    }

    @Test
    void testGetActivityName(){
        assertEquals("Theatre Show", theatreShow.getActivityName());
    }

    @Test
    void testSetActivityName(){
        theatreShow.setActivityName("Concert");
        assertEquals("Concert", theatreShow.getActivityName());
    }

    @Test
    void testNoBalance(){
        Passenger passenger4 = new Passenger("Ethan", 123456, "Standard", 0);
        assertEquals(50.0, theatreShow.calculateCost(passenger4));
        assertEquals("You do not have enough balance to register for this activity", theatreShow.signUp(passenger4));
    }

    

}
