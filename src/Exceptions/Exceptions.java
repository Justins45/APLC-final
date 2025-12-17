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

    public int parkingAvailable (String parkingCount) throws RuntimeException{
        try{
            int maxParking = 50;
            int currentParking = Integer.parseInt(parkingCount);

            if (currentParking > maxParking){
                throw new RuntimeException();
            }
            elif (currentParking == maxParking){
                System.out.println("No parking is available");
            }
            return currentParking;
        } catch (RuntimeException e) {
            System.err.println("Parking is over capacity.");
            throw new RuntimeException(e);
        }
    }
}
