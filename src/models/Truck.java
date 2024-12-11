package models;

import exceptions.StateException;
import states.State;

public class Truck {

    private int id;

    private String name;

    private String driver;

    private String state;

    private transient State stateObj;

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

    public void changeDriver() {
        try{
            stateObj.changeDriver(this);
        } catch (StateException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}
