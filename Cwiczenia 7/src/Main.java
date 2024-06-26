import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car> {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.year, other.year);
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Year: " + year;
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota Corolla", 2015));
        cars.add(new Car("Honda Civic", 2018));
        cars.add(new Car("Ford Mustang", 2020));
        cars.add(new Car("Chevrolet Camaro", 2017));
        cars.add(new Car("BMW 3 Series", 2016));
        cars.add(new Car("Audi A4", 2019));
        cars.add(new Car("Mercedes-Benz C-Class", 2021));
        cars.add(new Car("Volkswagen Passat", 2014));
        cars.add(new Car("Subaru Impreza", 2013));
        cars.add(new Car("Mazda 3", 2012));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
