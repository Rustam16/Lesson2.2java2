package com.company;

public class Boy extends Person {
    private double growth;


    public Boy(String name, int age,String clothes ,double growth) {
        super.setName(name);
        super.setAge(age);
        super.setClothes(clothes);
        this.growth = growth;

    }

    public double getGrowth() {
        return growth;
    }

    public void setGrowth(double growth) {
        this.growth = growth;
    }

    @Override
    public void Print() {
        System.out.println(getName()+" age = "+getAge()+" clothes = " +
                getClothes()+" growth  = "+getGrowth());
    }

}