
package com.company;

public class Grandpa {
    private int salary;
    private House nation;
    private CarType carType;

    public Grandpa(int salary, House nation, CarType carType) {
        this.salary = salary;
        this.nation = nation;
        this.carType = carType;
    }

    public int getSalary() {
        return salary;
    }

    public House getHouse() {
        return nation;
    }

    public CarType getCarType() {
        return carType;
    }

    public String earnMoney(int salary){
        return ("I earn " + salary + " money");
    }

    public String fromHouse(House nation){
        return ("I am " + nation.getFamily());
    }
}