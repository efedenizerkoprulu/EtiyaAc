package Services.Concretes;

import DataAccsess.Abstracts.CarDao;
import Entities.Car;
import Services.Abstracts.CarService;

import java.util.List;

public class CarManager implements CarService {
    private final CarDao carDao;

    public CarManager(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> GetAll() {
        return carDao.GetAll();
    }

    @Override
    public void add(Car car) {
        if (isNegativePrice(car) && !IsExsistCar(car.getId())) {
            carDao.add(car);
            return;
        }
        System.out.println(car.getId()+" idsine sahip veri eklenemiyor aynı id ye sahip veri ya da fıyatı - olamaz ");

    }

    @Override
    public void Delete(Car car) {
        carDao.Delete(car);

    }

    @Override
    public Car Update(int id) {
        return carDao.Update(id);
    }

    @Override
    public boolean IsExsistCar(int id) {
        return carDao.GetAll().stream().anyMatch(car -> car.getId() == id);
    }

    @Override
    public boolean isNegativePrice(Car car) {
        if (car.getPrice() > 0) {
            return true;
        }
        return false;
    }
}
