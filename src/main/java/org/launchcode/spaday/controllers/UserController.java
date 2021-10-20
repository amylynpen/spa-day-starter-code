package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("/add")
    public String displayAddUserForm() {
        return "user/add";
    }

    @PostMapping
    public String processAddUserForm(Model model, @ModelAttribute @Valid User user, Errors errors, String verify) {
        model.addAttribute(new User());
        model.addAttribute("user", user);
        model.addAttribute("verify", verify);
        model.addAttribute("username", user.getUsername());
        model.addAttribute("email", user.getEmail());
/*        if (user.getPassword().equals(verify)) {
           return "user/index";
        }
        else {
            model.addAttribute("error", "Passwords do not match");
            return "user/add";
        }*/
        if (errors.hasErrors()) {
            model.addAttribute("error", "Bad data!");
            return "user/add";
        } else {
            return "user/index";
        }
    }
    private void checkPassword(User user){
        if (user.getPassword() == user.getVerifyPassword()&& user.getPassword() != null && user.getVerifyPassword() != null){

        }
    }

}
