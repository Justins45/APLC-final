import java.util.ArrayList;
import java.util.List;

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
        // overflow exception
        System.out.println("Parking lot cannot fit anymore stalls!");
      }
    }
    // TODO: add way to create a full list without adding one by one
}



// parking spot takes number for size
// -- exception check for non zero number
// -- when adding exception check for hitting max / going over size

// vehcile creation
// -- exception check for correct licence plate format