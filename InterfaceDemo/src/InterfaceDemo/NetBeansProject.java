package InterfaceDemo;
/**
 *
 * @author Nicholson.Bill
 * This class models a NetBeans project.
 * It implements the InterfaceDemo interface.
 */
public class NetBeansProject extends BaseClass implements InterfaceDemo {

        public boolean Build() {
            boolean status = false;
//          We don't know how to build a NetBeans project, yet.
//          However, we can still implement the interface to a limited extent.

//          The code that is specific to building a NetBeans project would go here.
            System.out.println("\nHello from NetBeansProject.Build()");

            return status;
        }
}
