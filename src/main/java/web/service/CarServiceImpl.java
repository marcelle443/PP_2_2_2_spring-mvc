package web.service;

import org.springframework.stereotype.Service;
import web.models.Cars;
import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    private List<Cars> cars;

    public CarServiceImpl() {
        this.cars = new ArrayList<>();
        this.cars.add(new Cars("Toyota", "Camry"));
        this.cars.add(new Cars("Ford", "Focus"));
        this.cars.add(new Cars("Volkswagen", "Golf"));
        this.cars.add(new Cars("Lada", "Vesta"));
        this.cars.add(new Cars("Kia", "Rio"));
        }

    @Override
    public List<Cars> getCars(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}





