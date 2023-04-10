package ConsoleUI;

import DataAccsess.Concretes.CarInMemoryDao;
import Entities.Car;
import Entities.Motorcycle;
import Entities.Vehicle;
import Services.Abstracts.CarService;
import Services.Concretes.CarManager;

public class Main {
    public static void main(String[] args) {
        Car vehicle1 = new Car(1, "karoq", "karoq", "2023", "skoda", "1.6 dizel", "gümüş",2000000, 4);
        Motorcycle vehicle2 = new Motorcycle(2, "GSX-R125", "GSX-R125", "2023", "Suziki", "124,4 cm3 (7,6 cu.in)", "gümüş",100000, 2);
        Car vehicle3 = new Car(2, "superb", "superb", "2023", "skoda", "1.7 benzin", "beyaz",8000000, 4);
        Car vehicle4 = new Car(1, "A8", "A8", "2023", "Audi", "1.6 dizel", "gümüş",2000000, 4);


        CarService carService = new CarManager(new CarInMemoryDao());

        carService.add(vehicle3);
        carService.add(vehicle1);
        carService.add(vehicle4);

        GetCarList(carService);
        carService.Delete(vehicle1);
        GetCarList(carService);
        Car UpdateedCar = carService.Update(vehicle3.getId());
        UpdateedCar.setYear("2015");
        GetCarList(carService);

    }

    public static void GetCarList(CarService carService) {
        System.out.println("---------------- Car list ------------------");

        for (Car car : carService.GetAll()) {
            System.out.println("Id: " + car.getId() + " \nModel :" + car.getModel() + "\nMarka: " + car.getBrand() + "\nYılı:" + car.getYear() + "\nRengi: " + car.getColor() + "\nMotor Gücü: " + car.getEngine() + "\nFiyatı: "+car.getPrice() +"\nTeker Sayısı: " + car.getWheelCount());
            System.out.println("----------------------------");
        }
    }
}