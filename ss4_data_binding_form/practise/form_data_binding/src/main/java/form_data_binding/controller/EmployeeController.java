package form_data_binding.controller;

import form_data_binding.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/create")
    public String showForm(ModelMap model) {
        model.addAttribute("employee", new Employee());
        return "create";
    }

    @PostMapping("/create")
    public String createEmployee(@ModelAttribute Employee employee, ModelMap model) {
        model.addAttribute("name", employee.getName());
        model.addAttribute("contactNumber", employee.getContactNumber());
        model.addAttribute("id", employee.getId());
        return "info";
    }

}
