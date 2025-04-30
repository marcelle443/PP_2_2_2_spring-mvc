package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Cars;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;


@Controller
@RequestMapping("/cars")
public class CarControler {


    private final CarService carService;

    @Autowired
    public CarControler(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {

        List<Cars> cars = (List<Cars>) carService.getCars(count);

        model.addAttribute("cars", cars);
        return "cars";



    }

}
