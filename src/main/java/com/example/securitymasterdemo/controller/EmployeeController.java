package com.example.securitymasterdemo.controller;

import com.example.securitymasterdemo.dao.EmployeeDao;
import com.example.securitymasterdemo.entity.Employee;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeDao employeeDao;
    @GetMapping("/employee/list-employees")
    public String listEmployees(Model model){
        model.addAttribute("employees",
                employeeDao.findAll());
        return "employees";
    }

    public String deleteEmployee(){
        return "redirect:/employees";
    }
    @GetMapping("/employee/create-employee")
    public String createEmployee(Model model){
        model.addAttribute("employee",new Employee());
        return "employeeForm";
    }
    @PostMapping("/employee/save-employee")
    public String saveEmployee(@Valid  Employee employee, BindingResult result){
        if(result.hasErrors()){
            return "employeeForm";
        }
        employeeDao.save(employee);
        return "redirect:/employeeForm";
    }
}
