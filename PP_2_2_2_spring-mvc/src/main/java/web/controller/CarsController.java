package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.CarService;

@Controller
public class CarsController {

    private CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCarTable(Model model, @RequestParam(value = "count", required = false) Integer count) {
        if (count > 0 && count < 5) {
            model.addAttribute("cartable", carService.getCars(0, count));
        } else {
            model.addAttribute("cartable", carService.getCars());
        }
        return "car_table";
    }
}
