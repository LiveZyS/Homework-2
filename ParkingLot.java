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

    public ParkingSpot[] spots;

    public ParkingLot() {

        spots = new ParkingSpot [8];
        spots[0] = new ParkingSpot (true);
        spots[1] = new ParkingSpot (true);
        spots[2] = new ParkingSpot (false);
        spots[3] = new ParkingSpot (false);
        spots[4] = new ParkingSpot (false);
        spots[5] = new ParkingSpot (false);
        spots[6] = new ParkingSpot (false);
        spots[7] = new ParkingSpot (false);
        spots[8] = new ParkingSpot (false);

    }

    public int ParkCar (Car car) {

        if (car.isHandicap()) {
            for (int i = 0; i < spots.length; i++) {
                if (spots[i].isHandicap() && spots[i].GetCar() == null) {
                    spots[i].ParkCar(car);
                    return i;
                }
            }
        }
        for (int i = 0; i < spots.length; i++) {
            if (!spots[i].isHandicap() && spots [i].GetCar() == null) {
                spots[i].ParkCar(car);
                return i;
            }
        }
        return -1;
    }

    public Car RemoveCar (int index) {

        Car RemovedCar = spots[index].GetCar();
        spots[index].ParkCar(null);
        return RemovedCar;
    }

    public String toString() {

        int HandicapCount = 0;
        int NonHandicapCount = 0;

        for (int i = 0; i < spots.length; i++) {
            if (spots[i].GetCar() == null) {
                if (spots[i].isHandicap()) {
                    HandicapCount++;
                }
                else {
                    NonHandicapCount++;
                }
                }
         }

         return HandicapCount + " " + NonHandicapCount;
     }
}

