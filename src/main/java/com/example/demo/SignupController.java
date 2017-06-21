package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by student on 6/21/17.
 */
@Controller
public class SignupController {
    @Autowired
    private SignupRepository signupRepository;
    @GetMapping("/signup")
    public String index(Model model){
        model.addAttribute("signup", new Signup());
        return "signup";
    }
    @PostMapping("/signup")
    public String signupSubmit(@ModelAttribute Signup signup){
        return "result";
    }

}
