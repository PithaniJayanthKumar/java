package com.wipro.java.java8.usecase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Optional;
import java.time.LocalDate;

class EmployeeServiceTest {
    
    private EmployeeService employeeService;

    @BeforeEach
    void setUp() {
        employeeService = new EmployeeService();
        // Adding test data
        employeeService.addEmployee(new Employee(1, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10)));
        employeeService.addEmployee(new Employee(2, "Bob", "HR", 45000, LocalDate.of(2019, 3, 15)));
        employeeService.addEmployee(new Employee(3, "Charlie", "Finance", 60000, LocalDate.of(2021, 8, 22)));
    }

    @Test
    void testAddEmployee() {
        Employee newEmployee = new Employee(4, "David", "Sales", 55000, LocalDate.of(2022, 2, 10));
        employeeService.addEmployee(newEmployee);
        Optional<Employee> addedEmployee = employeeService.searchEmployee(4);
        assertTrue(addedEmployee.isPresent());
        assertEquals("David", addedEmployee.get().getName());
    }

    @Test
    void testRemoveEmployee() {
        employeeService.removeEmployee(1);
        Optional<Employee> removedEmployee = employeeService.searchEmployee(1);
        assertFalse(removedEmployee.isPresent());
    }

    @Test
    void testSearchEmployee() {
        Optional<Employee> employee = employeeService.searchEmployee(2);
        assertTrue(employee.isPresent());
        assertEquals("Bob", employee.get().getName());
    }

    @Test
    void testUpdateSalary() {
        employeeService.updateSalary(2, 48000);
        Optional<Employee> updatedEmployee = employeeService.searchEmployee(2);
        assertTrue(updatedEmployee.isPresent());
        assertEquals(48000, updatedEmployee.get().getSalary());
    }

    @Test
    void testFilterByDepartment() {
        List<Employee> hrEmployees = employeeService.filterByDepartment("HR");
        assertEquals(1, hrEmployees.size());
        assertEquals("Bob", hrEmployees.get(0).getName());
    }

    @Test
    void testSortByName() {
        List<Employee> sortedEmployees = employeeService.sortByName();
        assertEquals("Alice", sortedEmployees.get(0).getName());
        assertEquals("Bob", sortedEmployees.get(1).getName());
        assertEquals("Charlie", sortedEmployees.get(2).getName());
    }

    @Test
    void testGetAverageSalary() {
        double averageSalary = employeeService.getAverageSalary();
        assertEquals(51666.666666666664, averageSalary, 0.001);
    }
}