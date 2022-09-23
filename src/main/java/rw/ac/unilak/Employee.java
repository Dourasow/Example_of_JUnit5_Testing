package rw.ac.unilak;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String firstName;
    private String lastName;
    private String email;

    public Employee(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private static List<Employee> employeeList = new ArrayList<>();

    //method to validate the first Name
    public static boolean isFirstNameValid(String firstName){
        if(firstName.isEmpty() || firstName == null){
            return false;
        }
        return true;
    }

    //method to validate the Last Name
    public static boolean isLastNameValid(String lastName){
        if(lastName.isEmpty() || lastName == null){
            return false;
        }
        return true;
    }

    //method to validate to validate email
    public static boolean isEmailValid(String email){
        if (email.isEmpty() || email.equals("") || email == null) return false;
        if(email.startsWith("@") || email.endsWith("@") || !email.contains("@") || email.length() >4){
            return false;
        }
        return true;
    }

    public static List<Employee> addEmployeeToList(String firstName, String lastName, String email){
        boolean validFirstName = isFirstNameValid(firstName);
        boolean validLastName = isLastNameValid(lastName);
        boolean validEmail = isEmailValid(email);

        if (validFirstName && validLastName && validEmail ){
            Employee employee = new Employee(firstName, lastName, email);
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
