package web.model;

public class Car {
    private String series;
    private int number;
    private String owner;

    public String getSeries() {
        return series;
    }

    public Car(String series, int number, String owner) {
        this.series = series;
        this.number = number;
        this.owner = owner;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "series='" + series + '\'' +
                ", number=" + number +
                ", owner='" + owner + '\'' +
                '}';
    }
}
