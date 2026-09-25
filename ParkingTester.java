/* 
Contains only a main class that performs the following operations:
▪ Instantiate a ParkingLot
▪ “Print” the ParkingLot by calling its ToString() method
▪ Instantiate a Car that represents a “Blue Subaru”, with handicap accessible tags
▪ Park this Car in the ParkingLot
▪ “Print” the ParkingLot by calling its ToString() method
▪ Instantiate a Car entirely that represents a “Red Ford”, non-handicap
▪ Park this Car in the ParkingLot
▪ “Print” the ParkingLot by calling its ToString() method
▪ Remove the first Car (the Ford) from the ParkingLot
▪ “Print” the ParkingLot by calling its ToString() method
*/
public class ParkingTester {

    public static void main(String[] args) {

        ParkingLot lot = new ParkingLot();

        System.out.println(lot.toString());
        
        Car car1 = new Car("subaru", "blue", true);
        Car car2 = new Car("ford", "red", false);

        lot.ParkCar(car1);
        lot.ParkCar(car2);
        
        System.out.println(lot.toString());

        lot.RemoveCar(1);

        System.out.println(lot.toString());
    }
}

