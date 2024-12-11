package states;

import exceptions.StateException;
import models.Driver;
import models.Truck;

import java.util.Random;

public class OnRepair implements State{
    @Override
    public void startDriving(Truck truck) {
        Random rnd = new Random();
        int randInt = rnd.nextInt(2) + 1;
        if(randInt < 2) {
            truck.setState("On base");
            truck.setStateObj(new OnBase());
            System.out.println("Грузовик поехал на базу");
        } else {
            truck.setState("On route");
            truck.setStateObj(new OnRoute());
            System.out.println("Грузовик отправился в рейс");
        }
    }

    @Override
    public void startRepair(Truck truck) throws StateException {
        throw new StateException("Уже в ремонте");
    }

    @Override
    public void changeDriver(Truck truck, Driver[] drivers) throws StateException {
        throw new StateException("Грузовик на ремонте");

    }
}
