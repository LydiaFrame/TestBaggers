/*
 * Class: Baggers.java
 * impute the bagger name, bagger start time, end time, is bagger a minor, bagger break time. Using military time.
 */

 public class Baggers {

    // Instance variables
    private String name;
    private boolean IsMinor;
    private int StartTime;
    private int EndTime;
    private int BreakTime; 

    // Static variable to count total number of Bagger instances
    public static int totalBaggers;

    // Constructor
    Baggers(String name, boolean IsMinor, int StartTime, int EndTime, int BreakTime){

        this.setName(name);
        this.setIsMinor(IsMinor);
        this.setStartTime(StartTime);
        this.setEndTime(EndTime);
        this.setBreakTime(BreakTime);

        // Increment the total number of baggers whenever a new object is created
        totalBaggers++;
    }

    // Getter methods
    public String getName(){
        return name; 
    }

    public String getIsMinor(){
        return IsMinor ? "Yes" : "No";
    }

    public int getStartTime(){
        return StartTime;
    }

    public int getEndTime(){
        return EndTime;
    }

    public int getBreakTime(){
        return BreakTime; 
    }

    // Setters methods
    public void setName(String name){
        this.name = name; 
    }

    public void setIsMinor(boolean IsMinor){
        this.IsMinor = IsMinor; 
    }

    public void setStartTime(int StartTime){
        this.StartTime = StartTime; 
    }

    public void setEndTime(int EndTime){
        this.EndTime = EndTime; 
    }

    public void setBreakTime(int BreakTime){
        this.BreakTime = BreakTime;
    }
}