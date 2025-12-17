import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<ParkingSpot> spots = new ArrayList<>();

    public void listSpots(){
        for (ParkingSpot item : spots) {
            System.out.println(item);
        }
    }
}
