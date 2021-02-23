package InterfaceDemo;

/**
 *
 * @author Nicholson.Bill
 *
 * This class models a car on an assembly line.
 * It implements the InterfaceDemo interface.
 */
public class Car extends BaseClass implements InterfaceDemo {

        public boolean Build() {
            boolean status = false;
//          We don't know how to build a car, yet.
//          However, we can still implement the interface to a limited extent.

//          The code that is specific to building a car would go here.
            System.out.println("\nHello from Car.Build()");
            return status;
        }
}
