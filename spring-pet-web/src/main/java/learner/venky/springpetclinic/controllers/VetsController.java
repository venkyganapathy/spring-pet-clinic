package learner.venky.springpetclinic.controllers;

import learner.venky.springpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {

    private VetService vetService;

    @Autowired
    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String getVets(Model model){
        model.addAttribute("vets",vetService.findAll());
        return ViewNames.vets;
    }
}
