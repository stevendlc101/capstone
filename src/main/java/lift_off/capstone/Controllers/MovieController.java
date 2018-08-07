package lift_off.capstone.Controllers;

import lift_off.capstone.Models.Data.MovieDao;
import lift_off.capstone.Models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("movie")
public class MovieController {

    @Autowired
    private MovieDao movieDao;

    @RequestMapping("")
    public String index (Model model){

        model.addAttribute("movies", movieDao.findAll());
        model.addAttribute("title", "Movies");

        return "movie/index";
    }

    @RequestMapping("add")
    public String addMovie (Model model) {

        model.addAttribute(new Movie());
        model.addAttribute("title", "Add Movie");

        return "movie/add";
    }

    @RequestMapping(value = "add", method=RequestMethod.POST)
    public String add(Model model,
                      @ModelAttribute @Valid Movie movie, Errors errors) {

        if (errors.hasErrors()) {
            return "movie/add";
        }

        movieDao.save(movie);
        return "redirect:";
    }
}
