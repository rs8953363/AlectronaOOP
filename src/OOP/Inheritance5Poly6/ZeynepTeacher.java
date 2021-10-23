package OOP.Inheritance5Poly6;

    public class ZeynepTeacher extends Teacher {
        private String name;
        private int age;
        private String badge;

        public ZeynepTeacher(String school, String subject, String name, int age, String badge) {
            super(school, subject);
            this.name = name;
            this.age = age;
            this.badge = badge;
        }

        public ZeynepTeacher(String name, int age, String badge) {
            this.name = name;
            this.age = age;
            this.badge = badge;
        }

        public ZeynepTeacher(String school, String subject) {
            super(school, subject);
        }

        public ZeynepTeacher() {
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

        public String getBadge() {
            return badge;
        }

        public void setBadge(String badge) {
            this.badge = badge;
        }

        @Override
        public String toString() {
            return "ZeynepTeacher{" + "name=" +
                    super.toString() +
                    ", name='" +name + '\'' +
                    ", age=" + age +
                    ", badge='" + badge + '\'' + '}';
        }
    }


