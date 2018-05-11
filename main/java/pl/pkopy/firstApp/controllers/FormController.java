package pl.pkopy.firstApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.pkopy.firstApp.models.RegisterForm;

import javax.validation.Valid;

@Controller
public class FormController {

    @GetMapping("/register")

    public String register(Model model){
        model.addAttribute("registerForm", new RegisterForm());
        return "register";
    }

    @PostMapping("/register")

    public String postRegister(@ModelAttribute @Valid RegisterForm registerForm,
                               BindingResult bindingResult,
                               Model model){
        if(bindingResult.hasErrors()){
            return "register";
        }

       model.addAttribute("info", "Ojojoj");

        return "register";

    }
}
