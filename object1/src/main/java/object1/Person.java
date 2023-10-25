package object1;

class Person {
    String name;
    int age = 0;

    double height;

    // Constructor
    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        // height in centimeters
        this.height = height;


        }
    public double getHeight() {
            return height;
    } // Declare and initialize an object


}

