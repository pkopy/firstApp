package pl.pkopy.firstApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.pkopy.firstApp.models.LoanForm;

import javax.validation.Valid;

@Controller
public class LoanController {

    @GetMapping("/loan")
    public String getLoan(Model model){
        model.addAttribute("getLoan", new LoanForm());
        return "loan";
    }

    @PostMapping
    public String postLoan(@ModelAttribute @Valid LoanForm loanForm,
                           BindingResult bindingResult){
        return "loan";

    }
}
