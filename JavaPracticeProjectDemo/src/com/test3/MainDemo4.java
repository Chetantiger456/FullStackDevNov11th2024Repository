package com.test3;
class City{
    String name;
    void displayCityName(){
        System.out.println("City Name:"+name);
    }

    void displayWorld(String cWorld){
        System.out.println("City World:"+cWorld);
    }
}
class MetroCity extends City{
    String name;
    MetroCity(String name, String cWorld){
        super.name=name;
        super.displayWorld(cWorld);
    }
    void displayMetroCityName(){
        System.out.println("Metro City Name:"+name);
    }

    void displayWorld(String mWorld){
        System.out.println("Metro World:"+mWorld);
    }
}
public class MainDemo4 {
    public static void main(String[] args) {
        MetroCity metroCity = new MetroCity("Bangalore", "Universe");
        metroCity.displayCityName();
        metroCity.name="Delhi";
        metroCity.displayMetroCityName();
        metroCity.displayWorld("Galaxy");
    }
}
