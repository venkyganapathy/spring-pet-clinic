package learner.venky.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnersController {

    @RequestMapping({"/owners","/owners/index","/owners/index.html"})
    public String getOwners(){
        return ViewNames.owners;
    }
}
