package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path="/add")
    public @ResponseBody String addNewSignup(@RequestParam String name,@RequestParam String food)
    {Signup s = new Signup();
    s.setName(name);
    s.setFood(food);
    signupRepository.save(s);
    return "Saved";
    }


    @PostMapping("/signup")
    public String signupSubmit(@ModelAttribute Signup signup){
        return "result";
    }

}
