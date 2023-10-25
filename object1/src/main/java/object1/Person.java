package object1;

class Person {
    String name;
    int age = 0;

    int height;

    // Constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        // height in centimeters
        this.height = height;
    } // Declare and initialize an object
    Person person1 = new Person("John", 30, 165);
}

