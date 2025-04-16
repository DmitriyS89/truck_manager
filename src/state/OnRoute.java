package state;

import exceptions.StateException;
import models.Driver;
import models.Truck;

public class OnRoute implements State{
    @Override
    public void changeDriver(Truck truck, Driver[] drivers) throws StateException {
        throw new StateException("Грузовик в пути. Невозможно сменить водителя");
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
        System.out.println("Грузовик отправлен на ремонт");
    }
}
