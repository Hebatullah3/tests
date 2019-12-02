//public class WrongClass {

import java.io.IOException;
import java.util.logging.FileHandler;

public class Robot {

        int weight;
        String name;
        private String color;
        String eyesColor;
        String surname;


        Robot () {
            this.name = "Berlin";
            this.color = "yellow";
        }

        Robot(String name, String eyesColor, int weight) throws IOException {
            this.name = name;
            this.eyesColor = eyesColor;
            this.weight = weight;
            FileHandler handler = new FileHandler();
        }


        Robot(String name, String color, String eyesColor, int weight){
            // this(name, eyesColor);
            this.surname = name;
            this.eyesColor = eyesColor;
            this.color = color;
            this.weight = weight;
        }

        Robot(String name){
            this.name = name;
        }

        Robot(String name, String eyesColor){
            this.name = name;
            this.eyesColor = eyesColor;
        }

        void introduce() {
            if (this.name != null) {
                System.out.println("Hello! My name is " + this.name + ", I am " + this.color + ", I have "
                        + this.eyesColor + " eyes and I weight " + this.weight + " kilograms");
            }
        }



    public void changeColor(String newColor) {
        this.color = newColor;
    }

}
