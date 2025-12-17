public class Vehicle {

    private String plate;
    private String size;


    //getters
    public String getPlate() {
        return plate;
    }

    public String getSize() {
        return size;
    }

    //setters
    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setSize(String size) {
        this.size = size;
    }

    //constructor
    public Vehicle(String plate, String size){
        this.plate = plate;
        this.size = size;
    }
}
