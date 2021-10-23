package OOP.Inheritance5Poly6;

public class Part {

        private String identifier;
        private String manufacturer;
        private String description;

        public Part(String identifier, String manufacturer, String description) {
            this.identifier = identifier;
            this.manufacturer = manufacturer;
            this.description = description;
        }

        public String getIdentifier() {
            return identifier;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public String getDescription() {
            return description;
        }

        public void sayHello(){
            System.out.println("Hello");
        }

        @Override
        public String toString() {
            return "Part{" +
                    "identifier='" + identifier + '\'' +
                    ", manufacturer='" + manufacturer + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }
    }

