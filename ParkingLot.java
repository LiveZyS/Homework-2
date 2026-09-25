/*
Contains an array of eight ParkingSpots, two of which must be handicap accessible.
Implements a constructor that creates the aforementioned array.
Implements a method that takes a Car and parks it in an appropriate available parking spot.
This method should return an int representing the chosen index of the chosen parking spot in
the array.
Implements a method that takes an int and removes and returns the specified Car from the
given Parking Spot.
Implement toString() to return a string containing the number of handicap accessible and
standard parking spots available separated by a single space (X Y)
*/

public class ParkingLot {

    ParkingSpot [] Spots = new ParkingSpot[8];{

    Spots[0] = new  ParkingSpot(true);
    Spots[1] = new  ParkingSpot(true);
    Spots[2] = new  ParkingSpot(false);
    Spots[3] = new  ParkingSpot(false);
    Spots[4] = new  ParkingSpot(false);
    Spots[5] = new  ParkingSpot(false);
    Spots[6] = new  ParkingSpot(false);
    Spots[7] = new  ParkingSpot(false);

    }

    public int ParkedCar(Car car) {

        for (int i =0; i < Spots.length; i++) {
            if (Spots[1].car == null && car.Handicap == true){
                return i;
            }
            if (Spots[i].car == null && car.Handicap == false) {
                return i;
            }
            else {
                return -1;
            }

        }
    }

    public String toString(){

        int HandicapSpots = 0;
        int NonHandicapSpots = 0;

        for (ParkingSpot spot : Spots) {
            if (spot.isHandicap()) {
                HandicapSpots++;
            } else {
                NonHandicapSpots++;
            }
        }

        return HandicapSpots + " " + NonHandicapSpots;
    }

}
