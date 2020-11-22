package com.company;

public class Man extends Person{
    private String hairColor;


    public Man(String name,int age ,String clothes ,String hairColor) {
        super.setName(name);
        super.setAge(age);
        super.setClothes(clothes);
        this.hairColor = hairColor;
    }

    public Man(String name, int age, String clothes) {
        super(name, age, clothes);
    }

    protected Man() {
    }

    public String getHairColor() {
        return hairColor;
    }
    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }

    @Override
    public void Print() {
        System.out.println(getName()+" age = "+getAge()+" clothes = " +
                getClothes()+" hairColor = "+getHairColor());
    }
}
