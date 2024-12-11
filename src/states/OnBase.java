package states;

import models.Truck;

public class OnBase implements State{


    @Override
    public void startDriving(Truck truck)  {
        truck.setStateObj(new OnRoute());
        truck.setState("On route");
    }

    @Override
    public void startRepair(Truck truck) {
        truck.setStateObj(new OnRepair());
        truck.setState("On repair");
    }

    @Override
    public void changeDriver(Truck truck) {
        // .......

    }
}
