package models;

import exceptions.StateException;
import states.OnBase;
import states.OnRepair;
import states.OnRoute;
import states.State;

import java.util.Objects;

public class Truck {

    private int id;

    private String name;

    private String driver;

    private String state;

    private transient State stateObj;

    private void initStateObj() {
        switch(state) {
            case "On base":
                stateObj = new OnBase();
                break;
            case "On route":
                stateObj = new OnRoute();
                break;
            case "On repair":
                stateObj = new OnRepair();
                break;
            default:
                stateObj = new OnBase();
                state = "On base";
                break;
        }
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getDriver() {
        return driver;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Truck{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", driver='").append(driver).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setStateObj(State stateObj) {
        this.stateObj = stateObj;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void startDriving() {
        try{
            stateObj.startDriving(this);
        } catch (StateException e) {
            e.getMessage();
            e.printStackTrace();
        }

    }

    public void startRepair() {
        try {
            stateObj.startRepair(this);
        } catch (StateException e) {
            e.getMessage();
            e.printStackTrace();
        }

    }

    public void changeDriver(Driver[] drivers) {
        if(Objects.isNull(stateObj))
            initStateObj();
        try{
            stateObj.changeDriver(this, drivers);
        } catch (StateException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}
