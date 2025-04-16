package models;

public class Driver {

    private String id;

    private String name;

    private String truck;

    public String getName() {
        return name;
    }


    public void setTruck(String truck) {
        this.truck = truck;
    }

    public String getTruck() {
        return truck;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", truck='" + truck + '\'' +
                '}';
    }
}
