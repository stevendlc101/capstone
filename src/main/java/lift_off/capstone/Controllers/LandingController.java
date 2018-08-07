package lift_off.capstone.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("landing")
public class LandingController {

    @RequestMapping("")
    public String index(Model model) {

        model.addAttribute("title", "Film Friends");

        return "landing/index";
    }
}
