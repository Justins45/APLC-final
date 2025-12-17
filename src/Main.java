import java.util.Scanner;

public final Scanner keyboardInput = new Scanner(System.in);

void main() {

  ParkingLot parkingLot = new ParkingLot();
  parkingLot.AddSpot("p1", "compact");
  //parkingLot.GetSize();


  int selection = -1;
  while (selection != 0) {
    selection = displayMenu();

    switch (selection) {
      case 1:
        System.out.println("Total Spots used: " + parkingLot.listSpots());
        break;
      case 2:
        createParkingSession(parkingLot);
        break;
      case 3:
        endParkingSession();
        break;
      case 0:
        System.out.println("Thank you for using the Smart Parking System!");
        System.out.println("Have a wonderful day!");
        break;
    }
  }
}


public Vehicle CreateVehicle() {
//  Scanner scanner = new Scanner(System.in);
  System.out.println("Please enter your license plate!");
  String plateNum = keyboardInput.nextLine();
  System.out.println("Please Choose a vehicle size");
  System.out.println("""
            ============
            1. Compact
            2. Large
            ============
          """);
  String vehicleSizeInput = keyboardInput.nextLine();
  String vechileSize = "unknown";

  boolean running = true;
  while(running) {
    switch (vehicleSizeInput) {
      case "compact":
//        vehicleSizeInput = "compact";
        running = false;
        break;
      case "large":
//        vehicleSizeInput = "large";
        running = false;
        break;
      case "unknown":
        vehicleSizeInput = "large";
        break;
      default:
        System.out.println("Please enter a valid option from the list..");
        vehicleSizeInput = keyboardInput.nextLine();

    }
  }

  return new Vehicle(plateNum, vehicleSizeInput);
}

public int displayMenu() {
  System.out.println("Welcome to the Smart Parking System");
  System.out.println("Please select an option:");
  System.out.println("1. Display spots");
  System.out.println("2. Park your vehicle");
  System.out.println("3. End parking session");
  System.out.println("0. Exit menu");
  boolean inputValid = false;
  int userInput = -1;
  while (!inputValid) {
    System.out.print("User selection: ");
    try {
      userInput = Integer.parseInt(keyboardInput.nextLine());
    } catch(Exception InvalidIntegerException) {
      System.out.println("Input is not an integer. Please make a valid selection.");
    }
    if (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 0) {
      inputValid = true;
    } else {
      System.out.println("Please enter a valid selection.");
    }
  }
  return userInput;
}

public void createParkingSession(ParkingLot parkingLot) {
  Vehicle vehicle = CreateVehicle();
  String size = vehicle.getSize();
  String spotId = parkingLot.findSpot(size);
  System.out.println(String.format("Parking confirmed. Please proceed to spot %s", spotId));
}

public void endParkingSession() {
  System.out.println("Enter parking spot id: ");
  String userInput = keyboardInput.nextLine();
  System.out.println(userInput);
}




















