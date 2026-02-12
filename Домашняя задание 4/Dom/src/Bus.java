public class Bus implements IVehicle {
    private int seats;
    private String routeType;

    public Bus(int seats, String routeType) {
        this.seats = seats;
        this.routeType = routeType;
    }

    @Override
    public void drive() {
        System.out.println("Автобус едет. Мест: " + seats + ", маршрут: " + routeType);
    }

    @Override
    public void refuel() {
        System.out.println("Автобус заправляется.");
    }
}
