package models;

public class Driver {

    private String id;

    private String name;

    private String truck;

    @Override
    public String toString() {
        return "Driver{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", truck='" + truck + '\'' +
                '}';
    }
}
