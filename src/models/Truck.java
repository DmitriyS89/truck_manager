package models;

import exceptions.StateException;
import state.State;

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

    public void setState(String state) {
        this.state = state;
    }

    public void setStageObj(State stageObj) {
        this.stateObj = stageObj;
    }

    public void changeDriver() {
        try {
            stateObj.changeDriver(this);
        } catch (StateException e) {
            e.getMessage();
        }
    }

    public void startDriving() {
        try{
            stateObj.startDriving(this);
        }catch (StateException e) {
            e.getMessage();
        }
    }

    public void startRepair() {
        try{
            stateObj.startRepair(this);
        }catch (StateException e) {
            e.getMessage();
        }
    }
}
