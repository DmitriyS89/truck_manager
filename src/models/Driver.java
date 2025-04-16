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

    @Override
    public String toString() {
        return "Driver{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", truck='" + truck + '\'' +
                '}';
    }
}
