package DataAccsess.Abstracts;

import Entities.Car;
import Entities.Motorcycle;

import java.util.List;

public interface MotorcycleDao {
    List<Motorcycle> GetAll();
    void add(Motorcycle motorcycle);
    void Delete(Motorcycle motorcycle);
    Motorcycle Update(Motorcycle motorcycle);

}
