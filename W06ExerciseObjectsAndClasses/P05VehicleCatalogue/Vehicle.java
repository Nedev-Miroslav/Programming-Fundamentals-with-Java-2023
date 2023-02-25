package W06ExerciseObjectsAndClasses.P05VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public Vehicle(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    @Override
    public String toString() {
        String formatting = "";
        if(this.type.equals("car")) {
            formatting = "Car";
        } else if (this.type.equals("truck")) {
            formatting = "Truck";
        }

        return String.format("Type: %s%nModel: %s%nColor: %s%n" +
                "Horsepower: %d", formatting, this.model,
                this.color, this.horsepower);
    }
}
