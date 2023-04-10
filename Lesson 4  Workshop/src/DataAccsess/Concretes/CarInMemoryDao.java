package DataAccsess.Concretes;

import DataAccsess.Abstracts.CarDao;
import Entities.Car;

import java.util.ArrayList;
import java.util.List;

public class CarInMemoryDao implements CarDao {

    List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> GetAll() {
        return cars;
    }

    @Override
    public void add(Car car) {
        cars.add(car);

    }

    @Override
    public void Delete(Car car) {
        cars.remove(car);
        System.out.println(car.getId()+" idsine sahip "+car.getModel()+" modeli sistemden silindi");


    }

    @Override
    public Car Update(int id) {
        return cars.stream().filter(car -> car.getId() == id).findFirst().orElseThrow();
    }
}

