package learner.venky.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {

    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String getVets(){
        return ViewNames.vets;
    }
}
