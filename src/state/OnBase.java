package state;

import exceptions.StateException;
import models.Driver;
import models.Truck;

public class OnBase implements State{

    @Override
    public void changeDriver(Truck truck, Driver[] drivers ) throws StateException {
        int freeDriverIndex = -1;
        for (int i = 0; i < drivers.length; i++) {

            if (drivers[i].getTruck() == null || drivers[i].getTruck().trim().isEmpty()) {
                freeDriverIndex = i;
                break;
            }
        }

        if (freeDriverIndex < 0) {
            throw  new StateException("Нет свободных водителей");
        }

        for (Driver driver : drivers) {
            if (truck.getName().equals(driver.getTruck())) {
                driver.setTruck("");
                break;
            }
        }
        drivers[freeDriverIndex].setTruck(truck.getName());
        truck.setDriver(drivers[freeDriverIndex].getName());
    }

    @Override
    public void startDriving(Truck truck) throws StateException {
        if (!truck.getDriver().trim().isEmpty()) {
            truck.setStageObj(new OnRoute());
            truck.setState("on_route");
            System.out.println("Грузовик отправился в рейс");
        } else {
            throw new StateException("Ошибка! Невозможно ехать без водителя");
        }

    }

    @Override
    public void startRepair(Truck truck) throws StateException {
        truck.setStageObj(new OnRepair());
        truck.setState("on_repair");
        System.out.println("Грузовик отправлен на ремонт");
    }
}
