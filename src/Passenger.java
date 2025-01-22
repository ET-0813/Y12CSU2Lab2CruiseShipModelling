public class Passenger {

    private String passengerName;
    private int passengerNumber;
    private String passengerType; //Standard, VIP, Senior
    private double balance;

    public Passenger(String passengerName, int passengerNumber, String passengerType, double balance){
        this.passengerName = passengerName;
        this.passengerNumber = passengerNumber;
        this.passengerType = passengerType;
        this.balance = balance;
    }

    public String getPassengerName(){
        return passengerName;
    }

    public void setPassengerName(String passengerName){
        this.passengerName = passengerName;
    }

    public int getPassengerNumber(){
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber){
        this.passengerNumber = passengerNumber;
    }

    public String getPassengerType(){
        return passengerType;
    }

    public void setPassengerType(String passengerType){
        this.passengerType = passengerType;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void addBalance(double amount){
        balance += amount;
    }

    public void deductBalance(double amount){
        balance -= amount;
    }

    /* public void signUp(Activity activity, passengerType){


    } */


    public String toString(){
        return "Name: " + passengerName + " Number: " + passengerNumber + " Type: " + passengerType + " Balance: " + balance;
    }


}
