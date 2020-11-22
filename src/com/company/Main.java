package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("Boy").Print();
        createObject("Girl").Print();
        createObject("Man").Print();

    }
    public static Person createObject(String className){

            if (className.equals(Girl.class.getSimpleName()))
                return new Girl("Maeve:",18,"Gucci","nike");
            else if (className.equals(Boy.class.getSimpleName()))
                return new Boy("Jackson:",17,"Louis Vuitton",1.7);
            else if (className.equals(Man.class.getSimpleName()))
                return new Man("Stark:",38,"Zara","black");
            else return null;
    }


}
