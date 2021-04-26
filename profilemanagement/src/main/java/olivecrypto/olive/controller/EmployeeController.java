package olivecrypto.olive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import olivecrypto.olive.domain.EmployeeProfile;
import olivecrypto.olive.service.EmployeeProfileService;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class EmployeeController {
    @Autowired
    EmployeeProfileService employeeProfileService;

    @PostMapping
    public void saveEmployeeProfile(@RequestBody EmployeeProfile employeeProfile) {
        employeeProfileService.addEmployeeProfile(employeeProfile);
    }

    @GetMapping
    public List < EmployeeProfile > getAllEmployee() {
        return employeeProfileService.getEmployeeProfiles();
    }

}