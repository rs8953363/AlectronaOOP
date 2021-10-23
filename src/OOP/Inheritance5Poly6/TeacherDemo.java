package OOP.Inheritance5Poly6;

public class TeacherDemo {
        public static void main(String[] args) {
            Teacher teacher = new Teacher("abc", "math");
            AhmetTeacher ahmetTeacher = new AhmetTeacher("abc", "math","ahmet",33);

            System.out.println(teacher.getSchool());
            System.out.println(ahmetTeacher.getSchool());
            System.out.println(ahmetTeacher.getSubject());

            ZeynepTeacher zeynepTeacher = new ZeynepTeacher();
            zeynepTeacher.setSchool("abc");
            zeynepTeacher.setSubject("English");
            zeynepTeacher.setName("zeynep");
            zeynepTeacher.setAge(25);
            zeynepTeacher.setBadge("zeynep");

            System.out.println(zeynepTeacher);

        }
    }

