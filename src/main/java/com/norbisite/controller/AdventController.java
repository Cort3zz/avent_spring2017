package com.norbisite.controller;

import com.norbisite.dao.DailyMessageDAO;
import com.norbisite.dao.DailyPasswordDAO;
import com.norbisite.domain.DailyPassword;
import com.norbisite.domain.LoginPassword;
import com.norbisite.validation.LoginPasswordValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger logger = LoggerFactory.getLogger(AdventController.class);

    @InitBinder("loginPassword")
    protected void initLoginBinder(WebDataBinder binder) {
        binder.addValidators(new LoginPasswordValidator());
    }

    @GetMapping(value = "/")
    public String login(Model model) {
        logger.info("logged in");
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
