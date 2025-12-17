import java.util.Scanner;

void main() {


  int selection = displayMenu();

  switch (selection) {
    case 1:
//      listSpots();
    case 2:
      createParkingSession();
    case 3:
      endParkingSession();
  }
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