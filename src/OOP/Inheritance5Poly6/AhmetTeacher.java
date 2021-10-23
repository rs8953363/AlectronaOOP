package OOP.Inheritance5Poly6;

    public class AhmetTeacher extends Teacher{

        //private String school; Teacher class'in Extend ettigimiz icin bunlari tanimlamaya gerek yok
    //  private String subject;
        private String name;
        private int age;

        public AhmetTeacher(String school, String subject, String name, int age) {
//        this.school = school; Teacher class'in Extend ettigimiz icin bunlari tanimlamaya gerek yok. Bunlarin yerine
//        super keywordu'unu kullaniyoruz.
//        this.subject = subject;
            super(school, subject);
            this.name = name;
            this.age = age;
        }

        public AhmetTeacher() {
        }

//    public String getSchool() { Teacher class'in Extend ettigimiz icin school ve subject'in getter ve setter'larini
//                               da kullanmaya gerek yok
//        return school;
//    }
//
//    public void setSchool(String school) {
//        this.school = school;
//    }
//
//    public String getSubject() {
//        return subject;
//    }
//
//    public void setSubject(String subject) {
//        this.subject = subject;
//    }

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

        @Override
        public String toString() {
            return "AhmetTeacher{" +
                    super.toString()+
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

