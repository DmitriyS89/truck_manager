package state;

import exceptions.StateException;
import models.Driver;
import models.Truck;

public interface State {

    void changeDriver(Truck truck, Driver[] drivers) throws StateException;

    void startDriving(Truck truck) throws StateException;

    void startRepair(Truck truck) throws StateException;

}
