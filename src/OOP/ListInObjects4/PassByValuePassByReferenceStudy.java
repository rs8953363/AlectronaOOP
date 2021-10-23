package OOP.ListInObjects4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassByValuePassByReferenceStudy {
        public static void main(String[] args) {
//        int number = 10; //degerin kendisini tutuyor. Methoda versek bile degeri degismiyor cunku copysani veriyor
//        changeNumberValue(number);
//        System.out.println(number);
//
//        int[] arr = {1,2,3,4,5}; //sadece adresi tutuyor. Datanin oldugu yerin adresini arr biliyor ve sadece adresini tutuyor
//        System.out.println(arr);
//        System.out.println(number);
//        changeNumberValue(number);
//        System.out.println(number);

            int[] arr = new int [3];
            arr[0] = 10;
            arr[1] = 20;

            addThirdValueToArray(arr); //
            System.out.println(Arrays.toString(arr)); //pass by reference

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                int randomNumber = (int)(Math.random()* 100);
                list.add(randomNumber);
            }
            System.out.println(list);//Java'da sadece Pass By Value var. Arka planda non-primitive'lerde Pass By Value
            // Pass By Reference gibi davraniyor
        }

        private static void changeNumberValue (int number){//Sadece ykaridaki degerin kopyasi buray geliyor. Method icinde
            // number'i degistiriyor ama method bitince dyukaridaki number'i degistiremiyor. Buna "Pass By value" denir

            number = 20;
        }
        private static void addThirdValueToArray (int[] arr){
            arr[2] = 30;
        }
    }


