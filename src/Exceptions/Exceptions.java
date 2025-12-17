package Exceptions;

public class Exceptions {
    public int validateInput(String input) throws NumberFormatException{
        try {
            int selection = Integer.parseInt(input);

            if (selection < 0){
                throw new NumberFormatException();
            }
            return selection;
        } catch (NumberFormatException e){
            System.err.println("Number selection invalid. Please enter a number corresponding to a function (1, 2, or 3)");
            throw new NumberFormatException("Enter a valid number for selection.");
        }
    }

    public static boolean parkingAvailable(int parkingCount) throws RuntimeException{
        boolean passing = true;
        try{
            int maxParking = 50;

            if (parkingCount > maxParking){
                throw new RuntimeException();
            }
            else if (parkingCount == maxParking){
                System.out.println("No parking is available");
                passing = false;
            }
            else {
                System.out.print("Unknown error occured.");
                passing = false;
            }
            return passing;
        } catch (RuntimeException e) {
            System.err.println("Parking is over capacity.");
            throw new RuntimeException(e);
        }
    }

    public void validateLicensePlate(String plateNum) throws RuntimeException {
      try{
        if (plateNum.length() != 6) {
          System.err.println("invalid licelce plate number...");
          throw new RuntimeException();
        }
      } catch (RuntimeException e) {
        System.err.println("Invalid license plate number...");
        throw new RuntimeException("Invalid license plate number... " + e);
      }
    }
}
