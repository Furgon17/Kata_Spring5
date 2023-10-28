package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    private CarService carService = new CarService();


    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String getAllCars(ModelMap model) {
       model.addAttribute("cars", carService.getAllCars());
       return "cars";
    }

    @GetMapping(params = "count")
    public String getCarsByCount(@RequestParam int count, ModelMap modelMap){
        modelMap.addAttribute("cars", carService.getCarByCount(count));
        return "cars";
    }
}
