package models;

import exceptions.StateException;
import state.OnBase;
import state.OnRepair;
import state.OnRoute;
import state.State;

import java.util.Objects;

public class Truck {

    private int id;

    private String name;

    private String driver;

    private String state;

    private transient State stateObj;

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", driver='" + driver + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    private void initStateObj() {
        switch (state) {
            case "on_base":
                stateObj = new OnBase();
                break;
            case "on_route":
                stateObj = new OnRoute();
                break;
            case "on_repair":
                stateObj = new OnRepair();
            default:
                stateObj = new OnBase();
                state = "on_base";
                break;
        }
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStageObj(State stageObj) {
        this.stateObj = stageObj;
    }

    public void changeDriver(Driver[] drivers) {
        if (Objects.isNull(stateObj)) {
            initStateObj();
        }
        try {
            stateObj.changeDriver(this, drivers);
        } catch (StateException e) {
            e.getMessage();
        }
    }

    public void startDriving() {
        if (Objects.isNull(stateObj)) {
            initStateObj();
        }
        try{
            stateObj.startDriving(this);
        }catch (StateException e) {
            e.getMessage();
        }
    }

    public void startRepair() {
        if (Objects.isNull(stateObj)) {
            initStateObj();
        }
        try{
            stateObj.startRepair(this);
        }catch (StateException e) {
            e.getMessage();
        }
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getState() {
        return state;
    }
}
