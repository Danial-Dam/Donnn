public class Motorcycle implements IVehicle {
    private String type;
    private int engineVolume;

    public Motorcycle(String type, int engineVolume) {
        this.type = type;
        this.engineVolume = engineVolume;
    }

    @Override
    public void drive() {
        System.out.println("Мотоцикл типа " + type + " едет. Объем: " + engineVolume);
    }

    @Override
    public void refuel() {
        System.out.println("Мотоцикл заправляется.");
    }
}
