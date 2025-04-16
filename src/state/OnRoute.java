package state;

import exceptions.StateException;
import models.Truck;

public class OnRoute implements State{
    @Override
    public void changeDriver(Truck truck) throws StateException {
        System.out.println("Грузовик в пути");
        throw new StateException("Грузовик в пути");
    }

    @Override
    public void startDriving(Truck truck) throws StateException {
        System.out.println("Грузовик уже в пути");
        throw new StateException("Грузовик  уже в пути");
    }

    @Override
    public void startRepair(Truck truck) {
        truck.setStageObj(new OnRepair());
        truck.setState("on_repair");
    }
}
