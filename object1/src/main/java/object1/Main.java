package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Person person2 = new Person("Bob", 32, 186);
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");
        logger.info(person2.getHeight() +"");
        System.out.println(person2.getHeight());
    }



}


