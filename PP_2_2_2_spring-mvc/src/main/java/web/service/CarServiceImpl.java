package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("bmw", 112, "Mark"));
        cars.add(new Car("audi", 101, "Max"));
        cars.add(new Car("opel", 134, "Anton"));
        cars.add(new Car("subaru", 245, "Max"));
        cars.add(new Car("lexus", 167, "Sergey"));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int from, int to) {
        return cars.subList(from, to);
    }

}
