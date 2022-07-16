/*
best practice is to write the main function in different file/class
because we can access the private members from the main function if
the main function is in the same class.
 */
public class Atest {
    public static void main(String[] args) {
        A ob;
        ob = new A();
        ob.setA(99);
        System.out.println(ob.getA());
    }
}
