package states;

import exceptions.StateException;
import models.Truck;

public class OnRepair implements State{
    @Override
    public void startDriving(Truck truck) {
//              truck.setStateObj(new OnBase());
//            truck.setState("On base");
//                        ||
//        truck.setStateObj(new OnRoute());
//        truck.setState("On route");
    }

    @Override
    public void startRepair(Truck truck) throws StateException {
        throw new StateException("Уже в ремонте");
    }

    @Override
    public void changeDriver(Truck truck) throws StateException {
        throw new StateException("Грузовик на ремонте");

    }
}
