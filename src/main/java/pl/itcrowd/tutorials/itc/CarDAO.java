package pl.itcrowd.tutorials.itc;

import javax.ejb.Stateless;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class CarDAO implements Serializable {

    private List<Car> cars = new ArrayList<Car>();

    public CarDAO()
    {
        this.cars.add(new Car("Pontiac"));
        this.cars.add(new Car("Polonez"));
        this.cars.add(new Car("Mazda"));
    }

    public List<Car> getAllCars()
    {
        return new ArrayList<Car>(cars);
    }
}
