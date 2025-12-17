import java.util.ArrayList;
import java.util.List;

public class ParkingLot {


    ParkingSpot[] spots;

  public ParkingLot(int size) {
      spots = new ParkingSpot[size];
    }

    public void listSpots(){
        for (ParkingSpot item : spots) {
            System.out.println(item);
        }
    }

    public void GetSize() {
      System.out.println(spots.length);
    }

    public void AddCar(Vehicle vehicle){

    }
}



// parking spot takes number for size
// -- exception check for non zero number
// -- when adding exception check for hitting max / going over size

// user inputs
// -- exception check for valid numbers

// vehcile creation
// -- exception check for correct licence plate format