package Services.Abstracts;

import Entities.Car;

import java.util.List;

public interface CarService {

    List<Car> GetAll();
    void add(Car car);
    void Delete(Car car);
    Car Update(int id);

   boolean IsExsistCar(int id);
   boolean isNegativePrice(Car car);

}
