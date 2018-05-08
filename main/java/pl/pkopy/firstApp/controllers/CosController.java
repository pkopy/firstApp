package pl.pkopy.firstApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CosController {

    @GetMapping("/cos")


    public String index(Model model){
        model.addAttribute("name", "Paweł");
        model.addAttribute("lastname", "Kopycki");
        return "index";
    }

    @GetMapping("/club/{age}")


    public String canI(@PathVariable("age") int age,
                       Model model) {
        model.addAttribute("age", age);


        return "index";
    }
}
