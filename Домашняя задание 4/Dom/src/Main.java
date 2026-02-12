import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleFactory factory = null;

        System.out.println("Выберите транспорт:");
        System.out.println("1 - Car");
        System.out.println("2 - Motorcycle");
        System.out.println("3 - Truck");
        System.out.println("4 - Bus");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Марка: ");
                String brand = sc.nextLine();
                System.out.print("Модель: ");
                String model = sc.nextLine();
                System.out.print("Тип топлива: ");
                String fuel = sc.nextLine();
                factory = new CarFactory(brand, model, fuel);
                break;

            case 2:
                System.out.print("Тип мотоцикла: ");
                String type = sc.nextLine();
                System.out.print("Объем двигателя: ");
                int volume = sc.nextInt();
                factory = new MotorcycleFactory(type, volume);
                break;

            case 3:
                System.out.print("Грузоподъемность: ");
                int cap = sc.nextInt();
                System.out.print("Количество осей: ");
                int ax = sc.nextInt();
                factory = new TruckFactory(cap, ax);
                break;

            case 4:
                System.out.print("Количество мест: ");
                int seats = sc.nextInt();
                sc.nextLine();
                System.out.print("Тип маршрута: ");
                String route = sc.nextLine();
                factory = new BusFactory(seats, route);
                break;

            default:
                System.out.println("Ошибка выбора");
                return;
        }

        IVehicle vehicle = factory.createVehicle();
        vehicle.drive();
        vehicle.refuel();
    }
}
