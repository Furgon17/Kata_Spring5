package web.dao;

import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.List;

public interface CarDAO {
    public List<Car> getAllCars();
    public List<Car> getCarsByCount(int count);
}
