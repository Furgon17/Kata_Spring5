package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAOimpl;
import web.model.Car;


import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarDAOimpl carDAOimpl;

    public CarService() {
    }

    public CarService(CarDAOimpl carDAOimpl) {
        this.carDAOimpl = carDAOimpl;
    }

    public List<Car> getAllCars(){
        return carDAOimpl.getAllCars();
    }

    public List<Car> getCarByCount(int count){
       return carDAOimpl.getCarsByCount(count);
    }
}
