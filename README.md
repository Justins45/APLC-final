# APLC - Final Readme Doc

Our project was to create a smart parking system that assigns people their parking spots based on availability and vehicle size.

The language we choose was Java for its ease of custom Exception handling with its try catch 
blocks and with its easy use of classes for the program

## System design overview

Our folders follow this structure 

- main
- ParkingLot (Class)
- ParkingSpot (Class)
- ReadData (Runnable)
- WriteData (Runnable)
- Exceptions 
  - Exceptions (Class)
- parkingSpots.txt (Output)

## Parallel Component

Our parallel component is the reading and writing of data to our data sheet, this allows the 
data to be stored outside of memory and this can be imported into other files elsewhere if 
needed.

## Exception handling

Our exception handling is validating the users input to make sure it is not a invalid number 
(below zero), checking if our parking lot  has exceeded capacity of 50 stalls, and making 
sure the license plate numbers being added to vehicles are 6 letters or numbers long.

## How to run the program

