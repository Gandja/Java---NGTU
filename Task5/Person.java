package Task5;

import java.util.ArrayList;

public class Person {
    String name;
    String sername;
    @Override
    public String toString () {
        return name + " " + sername;
    }
    public static void main(String[] args) {
        /*Person people1 = new Person();
        people1.name = "Denis";
        people1.sername = "Gandzha";
        System.out.println(people1);*/
        Person[] arr = new Person[4];
        String [] m = new String[4];
        Artist artist1 = new Artist();
        artist1.name = "Каземир";
        artist1.sername = "Малевич";
        artist1.style = "Черный квадрат";
        arr[0] = artist1;
        m[0] = artist1.style;
        Artist artist2 = new Artist();
        artist2.name = "Сальвадор";
        artist2.sername = "Дали";
        artist2.style = "Постоянство памяти";
        arr[1] = artist2;
        m[1] = artist2.style;
        Musician musician1 = new Musician();
        musician1.name = "Иоганн";
        musician1.sername = "Бах";
        musician1.instrument = "Органе";
        arr[2] = musician1;
        m[2] = musician1.instrument;
        Musician musician2 = new Musician();
        musician2.name = "Вольфганг";
        musician2.sername = "Моцарт";
        musician2.instrument = "Скрипке";
        arr[3] = musician2;
        m[3] = musician2.instrument;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] instanceof Artist) {
                System.out.println(arr[i] + " нарисовал " + m[i]);
            }
            else if (arr[i] instanceof Musician){
                System.out.println(arr[i] + " играл на " + m[i]);

            }

        }

    }
}

class Artist extends Person{
     String style;
}
 class Musician extends Person{
     String instrument;
 }