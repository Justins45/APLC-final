public class ParkingSpot {
    private String id;
    private String size;
    private boolean available;

    //getters
    public String getId() {
        return id;
    }

    public String getSize() {
        return size;
    }

    public boolean isAvailable() {
        return available;
    }

    //setters
    public void setId(String id) {
        this.id = id;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    //constructor
    public ParkingSpot(String id, String size, boolean available){
        this.id = id;
        this.size = size;
        this.available = available;
    }
}
