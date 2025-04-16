package state;

import exceptions.StateException;
import models.Driver;
import models.Truck;

public class OnBase implements State{

    @Override
    public void changeDriver(Truck truck, Driver[] drivers ) throws StateException {
        // TO DO
    }

    @Override
    public void startDriving(Truck truck) throws StateException {
        //Добавить проверку
        truck.setStageObj(new OnRoute());
        truck.setState("on_route");
        System.out.println("Грузовик отправился в рейс");
    }

    @Override
    public void startRepair(Truck truck) throws StateException {
        truck.setStageObj(new OnRepair());
        truck.setState("on_repair");
        System.out.println("Грузовик отправлен на ремонт");
    }
}
