package web.service;

import web.model.Cars;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    private List<Cars> cars = new ArrayList<>();

    public CarService(){
        cars.add(new Cars("X5", "BMW", 123));
        cars.add(new Cars("SEDAN", "Lada", 453));
        cars.add(new Cars("123", "Audi", 98632));
        cars.add(new Cars("NO_NAME", "Kia", 11111111));
        cars.add(new Cars("123", "Honda", 5454545));
    }

    public List<Cars> getAllCars() {
        return cars;
    }

    public List<Cars> getCountCars(@RequestParam(value="count", required = false) Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
