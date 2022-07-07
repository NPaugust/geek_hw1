package com.company;

public class Main {

    public static void main(String[] args) {
        House Dominicano = new House("Torreto Vin Dieselevich.",   "CEO of \"E Ron Don Don\" Company.");
        Dad daddy = new Dad(62, 11000000, Dominicano,CarType.DodgeCharger);
        System.out.println(daddy.fromHouse(daddy.getHouse()));
        System.out.println(daddy.earnMoney(daddy.getSalary()));

        System.out.println("");


        Dominicano = new House("Torreto Brayan O'Connorovich.", "\n" +
                "Head of department of the company.");
        Son son = new Son(36, 58000, Dominicano, CarType.ToyotaSupra);
        System.out.println(son.fromHouse(son.getHouse()));
        System.out.println(son.earnMoney(son.getSalary()));

        System.out.println("");

        Dominicano = new House("Diesel Vin Torretich Jr. .", "\n" +
                "police officer");
        Son son1 = new Son(31, 10000, Dominicano, CarType.NissanSkyline);
        System.out.println(son1.fromHouse(son1.getHouse()));
        System.out.println(son1.earnMoney(son1.getSalary()));


        System.out.println("");

        House.giveGas();
        House.giveGas("Vroom Vroom, Vroooooom!");
    }
}