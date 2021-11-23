package polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        Boat boat=new Boat();
        Bicycle bicycle=new Bicycle();

        Vehicle [] racers={car,bicycle,boat};
        for (Vehicle x:racers){
            x.go();
        }
    }
}
