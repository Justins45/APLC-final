import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import Exceptions.*;

public class ParkingLot {

    List<ParkingSpot> spots = new ArrayList<>();

    public int listSpots(){
      int count = 0;
        for (ParkingSpot _ : this.spots) {
            count++;
        }
        return count;
    }

    public void GetSize() {
      System.out.println("Parking lot size: " + this.spots.size());
    }

    public void AddSpot(String id, String size){
      if (this.spots.size() < 50) {
        this.spots.add(new ParkingSpot(id, size));
        WriteData write = new WriteData(spots);
        write.run();
      } else {
          Exceptions.parkingAvailable(this.spots.size());
          System.out.println("Parking lot cannot fit anymore stalls!");
      }
    }
    // TODO: add way to create a full list without adding one by one

    public String findSpot(String size) {
        for (ParkingSpot spot : this.spots) {
            if (Objects.equals(spot.getSize(), "unknown")) {
                size = "large";
            }
            if (Objects.equals(spot.getSize(), size) && spot.isAvailable()) {
                return spot.getId();
            }
        }
        System.out.println("No spots available that match required size");
        return null;
    }
}



// parking spot takes number for size
// -- exception check for non zero number
// -- when adding exception check for hitting max / going over size

// vehcile creation
// -- exception check for correct licence plate format