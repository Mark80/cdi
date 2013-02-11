package pl.itcrowd.tutorials.itc;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class CarListView implements Serializable {

    @Inject
    private CarDAO carDAO;

    public List<Car> getCars()
    {
        return carDAO.getAllCars();
    }
}
