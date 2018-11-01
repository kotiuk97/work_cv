package cv.mmix.working.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

//    @GetMapping(name = "/rabota")
//    public String rabota(){
//        return "rabota";
//    }

    @GetMapping("/rabota/vacancy")
    public String addVacancy(){
        return "vacancy";
    }
}
