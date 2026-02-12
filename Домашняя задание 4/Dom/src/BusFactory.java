public class BusFactory extends VehicleFactory {
    private int seats;
    private String routeType;

    public BusFactory(int seats, String routeType) {
        this.seats = seats;
        this.routeType = routeType;
    }

    @Override
    public IVehicle createVehicle() {
        return new Bus(seats, routeType);
    }
}
