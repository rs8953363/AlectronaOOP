package OOP.Inheritance5Poly6;

public class Student extends Person{

    private int credits;

        public Student(String name, String address) {
            super(name, address);
            this.credits = 0; //Since it says "at creation" in the question, we initialize it to 0 in the constructor.
        }
        public int credits(){
            return credits;
        }

        public void study(){
            this.credits++;
        }

        @Override// In order to use override there should be an inheritnce. Without paren-child relationship you cannot
        // use override.
        public String toString() {
            return super.toString()+"\n\t" + "Study credits "+this.credits;
        }
    }


