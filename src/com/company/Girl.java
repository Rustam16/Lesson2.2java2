package com.company;

public class Girl extends Person {
    private String shoes ;

    public Girl(String name,int age,String clothes,String shoes){
        super(name,age,clothes);
        this.shoes = shoes;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    @Override
    public void Print() {
        System.out.println(getName()+" age = "+getAge()+" clothes = " +
                getClothes()+ " shoes = "+getShoes());
    }
}
