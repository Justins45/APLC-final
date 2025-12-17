//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
  // to see how IntelliJ IDEA suggests fixing it.
  IO.println(String.format("Hello and welcome!"));

  for (int i = 1; i <= 5; i++) {
    //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
    // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
    IO.println("i = " + i);
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
  String vechileSizeInput = scanner.nextLine();
  String vechileSize;

  boolean running = true;
  while(running) {
    switch (vechileSizeInput) {
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

  // Vehicle newVehicle = new Vehicle(plateNum, vechileSize);
  // return newVechicle;

  Object newVehicle;
  return newVehicle;
}