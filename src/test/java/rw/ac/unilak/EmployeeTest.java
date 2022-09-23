package rw.ac.unilak;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void isFirstNameValid() {
        String firstName = "eee";
        assertTrue(Employee.isFirstNameValid(firstName), "First Name cannot be null");
    }

    @Test
    void isLastNameValid() {
        String lastName = "";
        assertTrue(Employee.isLastNameValid(lastName), "Last Name cannot be null");
    }

    @Test
    void isEmailNull() {
        String email = "";
        assertTrue(Employee.isEmailValid(email), "Email cannot be null");

    }

    @Test
    void isEmailStartWithAtOrEndWithAt() {
        String email = "@ere";
        assertTrue(Employee.isEmailValid(email), "Email must not start with @ or end with @");
    }

    @Test
    void isEmailHasLessThanFourDigits() {
        String email = "er@er";
        assertTrue(Employee.isEmailValid(email), "Email cannot be more than four digits");

    }
}