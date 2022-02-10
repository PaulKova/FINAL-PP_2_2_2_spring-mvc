package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    private static int CAR_COUNTER;
    private static final List<Car> listCars = new ArrayList<>();

    public List<Car> getCarList(int count) {
        if (count == 0 && listCars.size() == 0){
            listCars.add(new Car(++CAR_COUNTER, "Honda", "White"));
            listCars.add(new Car(++CAR_COUNTER, "Toyota", "Black"));
            listCars.add(new Car(++CAR_COUNTER, "Lada", "Yellow"));
            listCars.add(new Car(++CAR_COUNTER, "Ford", "White"));
            listCars.add(new Car(++CAR_COUNTER, "Ferrari", "Red"));
            return listCars;
        } if (count == 0){
            return listCars;
        }
        return listCars.stream().limit(count).collect(Collectors.toList());
    }

}