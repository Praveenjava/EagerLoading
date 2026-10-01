package in.praveenit.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.praveenit.entity.Employee;
import in.praveenit.repo.EmployeeRepository;

@RestController
public class TestController {

    private final EmployeeRepository employeeRepository;

    public TestController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employee")
    public String getEmployee() {

        Employee emp =
                employeeRepository.findById(101).get();

        System.out.println("Employee loaded");

        System.out.println("Employee Name: "
                + emp.getName());

        System.out.println("Now accessing Department...");

        System.out.println("Department Name: "
                + emp.getDepartment().getName());

        return "Success";
    }
}