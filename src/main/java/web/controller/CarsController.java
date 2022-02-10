package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import java.util.Optional;

@Controller
@RequestMapping()
public class CarsController {

    @GetMapping("cars")
    public String show(@RequestParam(value = "count") Optional<Integer> count, Model model) {
        CarService carService = new CarService();
        model.addAttribute("count", carService.getCarList(count.orElse(0)));
        return "cars";
    }
}
