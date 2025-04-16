package state;

import exceptions.StateException;
import models.Truck;

public interface State {

    void changeDriver(Truck truck) throws StateException;

    void startDriving(Truck truck) throws StateException;

    void startRepair(Truck truck) throws StateException;

}
