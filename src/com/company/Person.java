package com.company;

public  class Person implements Printable {
    private String name ;
    private int age;
    private String clothes;

    public Person(String name,int age,String clothes) {
        this.name = name;
        this.age= age;
        this.clothes = clothes;
    }

    protected Person() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getClothes (){
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }


    public void Print() {
        System.out.println();
    }
}
