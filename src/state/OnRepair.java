package state;

import exceptions.StateException;
import models.Truck;

public class OnRepair implements State {

    @Override
    public void changeDriver(Truck truck) throws StateException {
        System.out.println("Нельзя сменить водителя");
        throw new StateException("Нельзя сменить водителя");

    }

    @Override
    public void startDriving(Truck truck) {
//        truck.setStageObj(new OnRoute());
//            truck.setState("on_route");
//        ||
//        truck.setStageObj(new OnBase());
//        truck.setState("on_base");
    }

    @Override
    public void startRepair(Truck truck) throws StateException {
        System.out.println("Грузовик уже в ремонте");
        throw new StateException("Грузовик уже в ремонте");
    }
}
