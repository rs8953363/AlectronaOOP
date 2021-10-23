package OOP.Inheritance5Poly6;

public class Teacher{
        private String school;
        private String subject;

        public Teacher(String school, String subject) {
            this.school = school;
            this.subject = subject;
        }

        public Teacher() {
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        @Override
        public String toString() {
            return "Teacher{" +
                    "school='" + school + '\'' +
                    ", subject='" + subject + '\'' +
                    '}';
        }
    }


