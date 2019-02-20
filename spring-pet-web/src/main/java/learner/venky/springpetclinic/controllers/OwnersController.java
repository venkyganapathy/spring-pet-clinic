package learner.venky.springpetclinic.controllers;

import learner.venky.springpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnersController {

    private OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners","/owners/index","/owners/index.html"})
    public String getOwners(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return ViewNames.owners;
    }
}
