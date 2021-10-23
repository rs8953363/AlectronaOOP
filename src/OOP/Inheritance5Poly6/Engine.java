package OOP.Inheritance5Poly6;

    public class Engine extends Part {
        private String engineType;
//    private String identifier; Bu uc field'i iptal edebiliriz. Cunku bunlari Part class'indan aliyor
//    private String manufacturer;
//    private String description;

        public Engine(String engineType, String identifier, String manufacturer, String description) {
            super(identifier, manufacturer, description);//You need to call Parent Class' constructor in Child's class
            // constructor in the first line. It can be empty or parameter constructor. It doesn't matter. If you forget it,
            // the code will still work. Because JAVA puts the empty constructor for you. It doesn't create a paremetre
            // constructor.
            this.engineType = engineType;
//        this.identifier = identifier;//You can cancel these ones also. Use super keyword to get them from parent class (Part)
//        this.manufacturer = manufacturer;
//        this.description = description;
        }

        public String getEngineType() {
            super.sayHello();//With super key word you can access parent class' methods from the child class.//say. You can
            //use it without super keyword, too.
            //sayHello();
            return engineType;
        }

        @Override
        public String toString() {
            return "Engine{" + super.toString()+
                    "engineType='" + engineType + '\'' +
                    '}';
        }

        //public String getIdentifier() { //You can delete these getters, too as it extends to the Part class.
//        return identifier;
//    }
//
//    public String getManufacturer() {
//        return manufacturer;
//    }
//
//    public String getDescription() {
//        return description;
//    }

    }
