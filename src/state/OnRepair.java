package state;

import exceptions.StateException;
import models.Driver;
import models.Truck;

import java.util.Random;

public class OnRepair implements State {

    @Override
    public void changeDriver(Truck truck, Driver[] drivers) throws StateException {
        System.out.println("Нельзя сменить водителя");
        throw new StateException("Нельзя сменить водителя");

    }

    @Override
    public void startDriving(Truck truck) {
        Random rnd = new Random();
        int rndInt = rnd.nextInt(2) + 1;
        if (rndInt < 2) {
            truck.setState("on_repair");
            truck.setStageObj(new OnBase());
            System.out.println("Грузовик отправлен на базу");
        } else {
            truck.setState("on_route");
            truck.setStageObj(new OnRoute());
            System.out.println("Грузовик отправлен в рейс");
        }
    }

    @Override
    public void startRepair(Truck truck) throws StateException {
        System.out.println("Грузовик уже в ремонте");
        throw new StateException("Грузовик уже в ремонте");
    }
}
