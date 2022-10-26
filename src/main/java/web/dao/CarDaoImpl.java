package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Kia Rio", "black", 400));
        cars.add(new Car("Haval H6", "white", 1200));
        cars.add(new Car("Renault Stepway", "blue", 800));
        cars.add(new Car("Ford Fiesta", "blue", 400));
        cars.add(new Car("Renault Logan", "red", 500));
    }

    public List<Car> getAllCars() {
        return Collections.unmodifiableList(cars);

    }

    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
