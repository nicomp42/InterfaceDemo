package InterfaceDemo;

/**
 * Main.java
 * Entry Point for the project.
 * This class provides a main() method that kicks off everything else.
 * This class can be discarded and the other classes will still be functional.
 * This class gives developers a place to begin when analyzing your code.
 * @author Nicholson.Bill
 *
  */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      Instantiate objects of type Car and NetBeansProject
        Car myCar = new Car();
        NetBeansProject myNetBeansProject = new NetBeansProject();

//      This is an example of early binding
        myCar.Build();
        myNetBeansProject.Build();

//      Here's where it gets powerful
        BaseClass[] myObjectArray;
        myObjectArray = new BaseClass[2];
        int i;

//      Instantiate an object of type Car and store the reference in the array
        myObjectArray[0] = myCar;
//      Instantiate an object of a different type and store the reference in the SAME array
        myObjectArray[1] = myNetBeansProject;
        System.out.println("Entering loop to process base class objects...");
        for (i = 0; i < myObjectArray.length; i++) {
//          At run-time the correct Build() method is called by the JVM
//          A good example of late binding
            myObjectArray[i].Build();       // A call-back. Sweet.
        }
    }
}
