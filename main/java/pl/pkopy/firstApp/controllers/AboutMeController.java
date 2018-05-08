package pl.pkopy.firstApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AboutMeController {

    @GetMapping("/about")
    @ResponseBody()
    public String index(){
        int cos = 5 * 5;
        return cos + " wynik";
    }
}
