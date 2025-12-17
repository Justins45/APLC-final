import java.util.Scanner;

void main() {

ParkingLot parkingLot = new ParkingLot();
parkingLot.AddSpot(new ParkingSpot("p1", "compact"));
parkingLot.GetSize();


  int selection = displayMenu();

  switch (selection) {
    case 1:
      parkingLot.listSpots();
    case 2:
      createParkingSession();
    case 3:
      endParkingSession();
  }
}


public Object CreateVehicle() {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Please enter your license plate!");
  String plateNum = scanner.nextLine();
  System.out.println("Please Choose a vehicle size");
  System.out.println("""
            ============
            1. Compact
            2. Large
            ============
          """);
  String vehicleSizeInput = scanner.nextLine();
  String vechileSize = "unknown";

  boolean running = true;
  while(running) {
    switch (vehicleSizeInput) {
      case "1":
        vechileSize = "compact";
        running = false;
        break;
      case "2":
        vechileSize = "large";
        running = false;
        break;
      default:
        System.out.println("Please enter a valid option from the list..");
    }
  }

  return new Vehicle(plateNum, vechileSize);
}

public int displayMenu() {
  System.out.println("Welcome to the Smart Parking System");
  System.out.println("Please select an option:");
  System.out.println("1. Display spots");
  System.out.println("2. Park your vehicle");
  System.out.println("3. End parking session");
  System.out.print("User selection: ");
  Scanner keyboardInput = new Scanner(System.in);
  int userInput = keyboardInput.nextInt();
  System.out.println(userInput);
  keyboardInput.close();
  return userInput;
}

public void createParkingSession() {

}

public void endParkingSession() {

}