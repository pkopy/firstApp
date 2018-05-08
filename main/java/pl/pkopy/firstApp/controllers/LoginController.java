package pl.pkopy.firstApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.pkopy.firstApp.models.LoginForm;

@Controller
public class LoginController {

    @GetMapping("/login")

    public String login(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }

    @PostMapping("/login")

    public String postLogin(@ModelAttribute LoginForm loginForm,
                            Model model) {
        Boolean isLoginCorrect = loginForm.getLogin().equals("admin") && loginForm.getPassword().equals("admin");



        model.addAttribute("isLoginCorrect", isLoginCorrect);

        return "login";

    }

}
