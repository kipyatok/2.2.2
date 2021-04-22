package web.model;

public class Cars {
    private String name;
    private String serial;
    private int number;

    public Cars() {};

    public Cars(String name, String serial, int number) {
        this.name = name;
        this.serial = serial;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Name: " + name + " " + "Serial: " + serial + " " + "Number: " + number + " ";
    }
}
