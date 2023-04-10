package DataAccsess.Abstracts;

import Entities.Car;

import java.util.List;

public interface CarDao {
   List<Car> GetAll();
   void add(Car car);
   void Delete(Car car);
   Car Update(int id);

}
