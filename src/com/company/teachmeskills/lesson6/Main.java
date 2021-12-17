package com.company.teachmeskills.lesson6;

public class Main {
    public static void main(String[] args) {
        PassengerСar passengerСar=new PassengerСar(90,100,345.63,"BMW",4,8,"Универсал",5);
        passengerСar.printDetails();

        CargoTransport cargoTransport=new CargoTransport(200,110,300,"МАЗ",6,13,10);
        cargoTransport.printDetails();

        CivilTransport civilTransport=new CivilTransport(500,300,700,"Боинг",3,100,50,true);
        civilTransport.printDetails();

        MilitaryTransport militaryTransport=new MilitaryTransport(600,250,750,"Ми-8",4,90,true,0);
        militaryTransport.printDetails();

        passengerСar.printTripDistance(1);

        cargoTransport.liftLoad(0);

        civilTransport.liftPassengers(51);

        militaryTransport.shoot();
        militaryTransport.eject();
    }

}
