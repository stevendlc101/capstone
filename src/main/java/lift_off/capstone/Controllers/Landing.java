package lift_off.capstone.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Landing {

    @RequestMapping(value = "")
    @ResponseBody
    public String index() {
        return "Film Friends";
    }
}
