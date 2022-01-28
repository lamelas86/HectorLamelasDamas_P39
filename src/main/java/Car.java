public class Car {
    private String plate, brand, model, colour;
    private boolean carRoof;
    private int km, doors, places;

    public Car() {
        this.plate="undefined";
        this.brand="undefined";
        this.model="undefined";
        this.colour="undefined";
        this.carRoof=false;
        this.km=0;
        this.doors=5;
        this.places=5;
    }

    public Car(String plate) {
        this();
        this.plate=plate;
    }

    public Car(String brand, String model, String colour) {
        this();
        this.brand=brand;
        this.model=model;
        this.colour=colour;
    }

    public Car(String plate, String brand, String model, String colour,
               boolean carRoof, int km, int doors, int places)
    {                                       /* no es necesario llamar al this() porque */
        this.plate=plate;                   /* el constructor define todos los valores */
        this.brand=brand;
        this.model=model;
        this.colour=colour;
        this.carRoof=carRoof;
        this.km=km;
        this.doors=doors;
        this.places=places;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getPlate() {
        return plate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setCarRoof(boolean carRoof) {
        this.carRoof = carRoof;
    }

    public boolean getCarRoof() {
        return carRoof;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getKm() {
        return km;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public int getPlaces() {
        return places;
    }
}

