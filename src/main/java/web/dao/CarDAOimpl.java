package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Repository
public class CarDAOimpl implements CarDAO {
    private final List<Car> carList = Arrays.asList(
            new Car("Toyota", "Corolla", 2015),
            new Car("Honda", "Civic", 2017),
            new Car("Ford", "Mustang", 2020),
            new Car("Chevrolet", "Camaro", 2019),
            new Car("Nissan", "Altima", 2018)
    );
    private Car car;

    public CarDAOimpl(Car car) {
        this.car = car;
    }

    public CarDAOimpl() {
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        if (count >= carList.size()) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}
