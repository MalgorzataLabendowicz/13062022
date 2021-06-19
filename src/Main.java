public class Main {
    public static void main(String[] args){

      Car Opel = new Car(1, 3.2, 3);
      Opel.calculateMaximumSpeed();

    Car Seat = new Car("white","petrol","cos", 2004);
    Seat.checkIffrom2000();

    Motocykle Alpha = new Motocykle(2000,"Beta", 4.0, 2000, 'L');
    Alpha.getPrice();
    Alpha.setPrice(123);
    Alpha.getPrice();
    Alpha.printMotocykleInfo();

    Alpha.checkifBMW();
    Alpha.setModel("BMW");
    Alpha.checkifBMW();
    }

}
