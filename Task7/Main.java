package Task7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CircularSaws circularSaws = new CircularSaws("Bosch 600",1,"Есть",600,
                160, 60);
        CircularSaws circularSaws2 = new CircularSaws("Зубр ",2,"Есть",500,
                170, 80);
        Drills drills = new Drills("Patriot",3,"Есть",300,20,36);
        Drills drills2 = new Drills("Elephant",5,"Есть",600,28,56);
        FretSaws fretSaws = new FretSaws("Storm",6,"Нет",700,89,60);
        FretSaws fretSaws2 = new FretSaws("Цунами",9,"Нет",900,99,90);
        Laptops laptops = new Laptops("HP",5,"Yes",250,16,512,4,16.5,
                6);
        Laptops laptops2 = new Laptops("DELL",3,"Yes",190,8,256,4,16.5,
                7);
        HomeComputers homeComputers = new HomeComputers("Samsung",43,"No",345,32,1000,
                4);
        HomeComputers homeComputers2 = new HomeComputers("DNS",18,"No",245,16,1000,
                4);
        System.out.println(homeComputers);
        System.out.println("Пила:" + circularSaws.getName() + ", " + circularSaws.getCount() + "шт, " + "Радиус диска:"
                + circularSaws.getRadiusOfCircle() + ", Мощность:" + circularSaws.getPowerConsuption() + ", Гарантия:" +
                circularSaws.getQuantity() + ", Можно вернуть в течении дней:" + circularSaws.getDaysForReturn() +
                ", Документы для возврата:" + circularSaws.getRequariedDocuments() + ", " +  circularSaws.getPrice() + "$");


        System.out.println("Пила:" + circularSaws2.getName() + ", " + circularSaws2.getCount() + "шт, " + "Радиус диска:"
                + circularSaws2.getRadiusOfCircle() + ", Мощность:" + circularSaws2.getPowerConsuption() + ", Гарантия:" +
                circularSaws2.getQuantity() + ", Можно вернуть в течении дней:" + circularSaws2.getDaysForReturn() +
                ", Документы для возврата:" + circularSaws2.getRequariedDocuments() + ", " +  circularSaws2.getPrice() + "$");
    }

}
