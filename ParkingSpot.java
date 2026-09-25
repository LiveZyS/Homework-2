/*
Contains an instance of Car describing the car currently parked in this spot.
Contains a boolean variable “handicap”, set to true if the spot is handicap accessible.
Implements a constructor that takes the aforementioned boolean. 
*/
public class ParkingSpot {

    public Car car;
    public boolean Handicap;

    public ParkingSpot(boolean Handicap) {

        this.Handicap = Handicap;
        this.car = null;

    }

    public boolean isHandicap() {

        return Handicap;
    }

    public Car GetCar() {

        return car;
    }

    public void ParkCar (Car car) {

        this.car = car;
    }

}
