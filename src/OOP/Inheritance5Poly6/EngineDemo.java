package OOP.Inheritance5Poly6;

public class EngineDemo {
        public static void main(String[] args) {
            Engine engine = new Engine("combustion", "hz", "volkswagen", "VW GOLF 1L 86-91");
            System.out.println(engine.getEngineType());
            System.out.println(engine.getManufacturer());

            engine.sayHello();
        }
    }


