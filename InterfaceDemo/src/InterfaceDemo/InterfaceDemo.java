package InterfaceDemo;
/**
 *
 * @author Nicholson.Bill
 *
 * We will create two classes that are not directly related but still share some
 *  process (or method) names at a conceptual level.
 * For example: we 'build' a NetBeans project and we also 'build' a car.
 *
 * This interface will require the classes that implement it to
 * each provide an implementation of a 'build' method.
 *
 * The design process is supported here because we don't need complete domain knowledge.
 * We can write the method interfaces and have them filled in later by someone
 *  who knows what they are talking about. 
 */
public interface InterfaceDemo {
    
//  This looks suspiciously like a C++ prototype.
//  The method has no body, just a method signature. There's no executable code.
    public boolean Build();
}
