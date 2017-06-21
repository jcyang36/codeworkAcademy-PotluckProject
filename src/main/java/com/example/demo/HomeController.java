package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by student on 6/21/17.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
        public String index(Model model) {
        model.addAttribute("signup", new Signup());
        return "signup";
    }
}
