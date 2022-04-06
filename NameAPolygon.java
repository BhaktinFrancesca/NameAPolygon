//Let's write a program that reads the number of sides of a polygon and writes the name for those between three and
//five sides.

public class NameAPolygon {
    public static void main(String[] args) {
   int sidesNumber = 6;
   String nameOfPolygon;

        switch(sidesNumber) {
            case 3:
                nameOfPolygon = "Your polygon is a triangle. \"Tri\" means \"three\".";
                break;
            case 4:
                nameOfPolygon = "Your polygon is a square.";
                break;
            case 5:
                nameOfPolygon = "Your polygon is a pentagon. \"Penta\" means \"five\".";
            default:
                nameOfPolygon = "Have you entered a valid number of sides? \"CPU\", so to speak, is not a valid" +
                        " number. Try a number between 3 and 5.";
        }

        System.out.println(nameOfPolygon);

    }
}
