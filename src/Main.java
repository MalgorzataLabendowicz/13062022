import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Mechanic pierwszy = new Mechanic("Jan","Kowal", 9876, "lakiernik");
        Motocykle Kawasaki = new Motocykle(7000, "Maniur", 4.0,2000,'m');
        Motocykle Honda = new Motocykle(5000, "xyz", 2.0,2001,'m');
        Motocykle Suzuki = new Motocykle(4000, "x", 4.9,2009,'m');

        ArrayList<Motocykle>motorcyclesTable = new ArrayList<>();
        motorcyclesTable.add(Kawasaki);
        motorcyclesTable.add(Honda);
        motorcyclesTable.add(Suzuki);

        Vehicle motocykle = new Vehicle();
        motocykle.motorcycleCheck(motorcyclesTable);

//        Car Opel = new Car(1, 3.2, 3);
//        Car BMW = new Car("taki", "red", "petrol", 2000);
//        Car Toyota = new Car("fajny", "white", "petrol", 3000);
//
//        ArrayList<Car> carTable = new ArrayList<>();
//        carTable.add(Toyota);
//        carTable.add(Opel);
//        carTable.add(BMW);
//        Vehicle pojazdy = new Vehicle();
//
//        carTable.remove(0);
//        carTable.get(0);
//        carTable.size();
//        pojazdy.checkIfListIsEmpty(carTable);
//        //      carTable.isEmpty();
//        // Toyota.checkIfListIsEmpty();

    }
}


//    Opel.calculateMaximumSpeed();

//  Car Seat = new Car("white","petrol","cos", 2004);
//  Seat.checkIffrom2000();

//  Motocykle Alpha = new Motocykle(2000,"Beta", 4.0, 2000, 'L');
// Alpha.getPrice();
//Alpha.setPrice(123);
//Alpha.getPrice();
//Alpha.printMotocykleInfo();

//    Alpha.checkifBMW();
//    Alpha.setModel("BMW");
//    Alpha.checkifBMW();
//    Alpha.checkPriceRange();

//  Alpha.changeCurrency(4.5);
//  Alpha.getPrice();
// }


