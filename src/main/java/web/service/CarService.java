package web.service;

import org.springframework.stereotype.Service;
import web.models.Cars;

import java.util.ArrayList;
import java.util.List;


public interface CarService {
    List<Cars> getCars(int count);
}




