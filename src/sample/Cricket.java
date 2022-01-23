/*
 * Name : Shubham Vyas
 * Enroll : 200469159
 * Description : Blueprint of main class contains getter and setters and constructors
 * */
package sample;

//Blueprint Class
public class Cricket {
    private int Runs;       //Private instance variable
    private String Name;    //Private instance variable
    private int Boundaries; //Private instance variable

    public Cricket(int Runs, String Name, int Boundaries) { //Parameters Constructor
        setName(Name);  //Calling setter method
        setBoundaries(Boundaries);  //Calling Setter method
        setRuns(Runs);  //Calling setter method
    }

    //getter method
    public int getRuns() {
        return Runs;
    }

    //setter method
    public void setRuns(int Runs) {

        if(Runs==0){
            throw new IllegalArgumentException("Runs cannot be Zero");
        }
        else {
            this.Runs = Runs;
        }
    }

    //getter method
    public String getName() {
        return Name;
    }

    //Setter method
    public void setName(String Name) {
        if(Name.length()<=2){
            throw new IllegalArgumentException("Name should be greater than 2 letters");
        }
        else {
            this.Name = Name;
        }
    }

    //getter method
    public int getBoundaries() {
        return Boundaries;
    }

    //Setter method
    public void setBoundaries(int Boundaries) {
        if(Boundaries<0){
            throw new IllegalArgumentException("Boundaries cannot be zero");
        }
        else {
            this.Boundaries = Boundaries;
        }
    }

    //Method ToString to return data
    @Override
    public String toString() {
        return "Cricket{" +
                "Runs=" + Runs +
                ", Name='" + Name + '\'' +
                ", Boundaries=" + Boundaries +
                '}';
    }
}
