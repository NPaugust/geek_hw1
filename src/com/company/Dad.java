package com.company;

public class Dad extends Grandpa{
    private int age;
    public Dad(int age, int salary, House house, CarType carType) {
        super(salary, house, carType);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public final String earnMoney(int salary) {
        return super.earnMoney(salary) + " at " + getAge();
    }

    @Override
    public String fromHouse(House house) {
        return super.fromHouse(house) + " My activity is " + house.getOccupation();
    }
}