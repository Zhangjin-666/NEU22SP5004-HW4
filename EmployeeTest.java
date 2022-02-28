    // * No default constructor is required. Also, overwrite equals() and toString(). Write a
    // * test class named EmployeeTest that demonstrates class Employee’s capabilities. Create two
    // * different Employee objects. Use println() to display information about each employee (this
    // * will invoke toString()). Then compare the two using equals() and display the result.
    // * Submission format: You MUST define TWO classes. One is Employee which must be declared
    // * as a non-public class. Two is EmployeeTest which is public and contains the main()
    // * method. So, you must submit one file EmployeeTest.java containing the above two classes.
    // * The tests must be performed in the main() method.
    
    public class EmployeeTest {
        public static void main(String[] args) throws IllegalAccessException {
            Employee p1 = new Employee("Patrick", "Smith", 99999);
            Employee p2 = new Employee("Patrick", "Smith", 99999);

            System.out.println(p1.toString());
            System.out.println(p2.toString());

            System.out.println(p1.equals(p2));
        }
}
