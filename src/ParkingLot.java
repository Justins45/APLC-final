import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    List<ParkingSpot> spots = new ArrayList<>();

    public void listSpots(){
        for (ParkingSpot item : this.spots) {
            System.out.println(item);
        }
    }

    public void GetSize() {
      System.out.println("Parking lot size: " + this.spots.size());
    }

    public void AddSpot(String id, String size){
      if (this.spots.size() < 50) {
        this.spots.add(new ParkingSpot(id, size));
      } else {
        // overflow exception
        System.out.println("Parking lot cannot fit anymore stalls!");
      }
    }
}



// parking spot takes number for size
// -- exception check for non zero number
// -- when adding exception check for hitting max / going over size

// user inputs
// -- exception check for valid numbers

// vehcile creation
// -- exception check for correct licence plate format