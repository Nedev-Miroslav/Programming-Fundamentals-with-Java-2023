package W06ExerciseObjectsAndClasses.P05VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicleList = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("End")){
            String type = command.split("\\s+")[0];
            String model = command.split("\\s+")[1];
            String color = command.split("\\s+")[2];
            int horsepower = Integer.parseInt(command.split("\\s+")[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsepower);
            vehicleList.add(vehicle);



            command = scanner.nextLine();
        }

        String secondCommand = scanner.nextLine();

        while (!secondCommand.equals("Close the Catalogue")) {

            for (Vehicle vehicle : vehicleList) {
                if(vehicle.getModel().equals(secondCommand)){
                    System.out.println(vehicle);
                    break;


                }
            }


            secondCommand = scanner.nextLine();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", getAvarage(vehicleList, "cars"));
        System.out.printf("Trucks have average horsepower of: %.2f.%n", getAvarage(vehicleList, "trucks"));

    }

    private static double getAvarage(List<Vehicle> vehicleList, String type) {
            double sumHorsePower = 0;
            int vehicleCount = 0;

            if(type.equals("cars")){
                for (Vehicle vehicle : vehicleList) {
                    if(vehicle.getType().equals("car")) {
                        sumHorsePower += vehicle.getHorsepower();
                        vehicleCount++;


                    }
                }
                
            } else if (type.equals("trucks")) {
                for (Vehicle vehicle : vehicleList) {
                    if(vehicle.getType().equals("truck")) {
                        sumHorsePower += vehicle.getHorsepower();
                        vehicleCount++;


                    }
                }


            }
            if(sumHorsePower == 0){
                return 0;
            }
            return sumHorsePower / vehicleCount;
    }
}
