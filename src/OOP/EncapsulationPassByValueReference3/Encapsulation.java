package OOP.EncapsulationPassByValueReference3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class Encapsulation {

        //Encapsulation: Verileri kapsule koyup sakliyoruz. Encapsulation fieldlari private yaparak herkesin erisimini
        // engelleyip, getter ve setter methodlariyla onlara erisimi saglamak.
        public static void main(String[] args) {
            //primitive int, char, double, boolean, float. Burada degisken data'yi kendisi tutuyor.
            //non primitive:reference variable, new keywordunu kullandiklarimiz. array, collection- arraylist,set, map, object.
            // Burada degisken data'nin tutuldugu yeri gosteriyor
            int x=10;//Bu primitive ve x 10'un kendisi

            changeXValue(x,20); // 2 memory space var; stack and hip
            System.out.println(x);
            System.out.println();

            People people1 = new People("Ahmet", 10);//Bu non-primitive type
            System.out.println(people1);
            System.out.println();

            changePeopleName(people1, "Mehmet");
            System.out.println(people1);//x degeri primitive type, primitive type'lar parametre olarak gectiginde kopyasini verir,
            // kendi orijinal degerini vermez. O yuzden bu ekrana 10 yazdirir.
            System.out.println();


            int[] arr = new int[3]; //soldaki deger object'in kendisi degiil. Object'i tutan pointer.
            arr[0] = 1;
            arr[1] = 2;
            System.out.println(Arrays.toString(arr));
            addElementToArray(arr,10);
            System.out.println(Arrays.toString(arr));
            System.out.println();

            List<Integer> list = new ArrayList<>(); //list: size = 4
            list.add(1);
            list.add(2);
            list.add(3);

            System.out.println(list);
            addElementToArrayList(list,10);
            System.out.println(list);
        }
        public static void changeXValue(int x, int newValue){
            x = newValue;
        }

        public static void changePeopleName(People people1, String newName){//non-primitive type'ler her zaman
            // orijinalini degistirir. Method'da yapilan her degisiklik orijinalini degistirir.
            people1.setName(newName);
        }
        public static void addElementToArray (int[] arr, int newValue){
            arr[2] = newValue;
        }
        public static void addElementToArrayList(List<Integer> list, int newValue){
            list.add(newValue);
        }
    }

