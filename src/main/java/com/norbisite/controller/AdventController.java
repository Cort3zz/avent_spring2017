package com.norbisite.controller;

import com.norbisite.dao.DailyMessageDAO;
import com.norbisite.dao.DailyPasswordDAO;
import com.norbisite.domain.DailyPassword;
import com.norbisite.domain.LoginPassword;
import com.norbisite.validation.LoginPasswordValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AdventController {

    @InitBinder("loginPassword")
    protected void initLoginBinder(WebDataBinder binder) {
        binder.addValidators(new LoginPasswordValidator());
    }

    @GetMapping(value = "/")
    public String login(Model model) {
        model.addAttribute("loginPassword", new LoginPassword());
        return "index";
    }

    @PostMapping(value = "/advent")
    public String advent(@Valid @ModelAttribute("loginPassword") LoginPassword loginPassword, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        return "advent";
    }
}
