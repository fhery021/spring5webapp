package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ferenc on 12/2/2018.
 */
@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    private static final String AUTHORS = "authors";

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/"+AUTHORS)
    public String getAuthors(Model model){
        model.addAttribute(AUTHORS, authorRepository.findAll());
        return AUTHORS;
    }
}
