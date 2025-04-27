package web.service;

import org.springframework.stereotype.Service;
import web.models.Cars;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Cars> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Cars("Toyota", "Camry"));
        cars.add(new Cars("Ford", "Focus"));
        cars.add(new Cars("Volkswagen", "Golf"));
        cars.add(new Cars("Lada","Vesta" ));
        cars.add(new Cars("Kia", "Rio"));
    }

    public List<Cars> getCars(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }

    }


