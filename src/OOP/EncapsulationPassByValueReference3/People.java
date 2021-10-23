package OOP.EncapsulationPassByValueReference3;

public class People {
        //state, field, instance variable
        private String name; //private yapinca buna sadece bu class'takiler erisebilir
        private int age;
//fieldlarin kontrol altinda tutulmasina encapsulation denir

        public String getName() {
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age > 100 || age < 0) {
                System.out.println("Yas 100'den buyuk yada 0'dan kucuk olamaz. Yasi 50 olarak atiyorum");
                this.age = 50;
            } else {
                this.age = age;
            }
        }

        public People(){
        }
        public People(String name, int age){
            this.name = name;
            this.age = age;
        }
        @Override
        public String toString() {
            return "People1{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
