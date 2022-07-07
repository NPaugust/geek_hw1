package com.company;

public final class Son extends Dad{
    public Son(int age, int salary, House house, CarType carType) {
        super(age, salary, house, carType);
    }

    @Override
    public String fromHouse(House house) {
        return super.fromHouse(house) + " I am " + getAge() + " years old. My car is " + getCarType();
    }
}