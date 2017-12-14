package com.norbisite.controller;

import com.norbisite.dao.DailyMessageDAO;
import com.norbisite.dao.DailyPasswordDAO;
import com.norbisite.domain.DailyMessage;
import com.norbisite.domain.MessagePassword;
import com.norbisite.validation.MessagePasswordValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class MessageController {

    private final DailyPasswordDAO dailyPasswordDAO;
    private final DailyMessageDAO dailyMessageDAO;

    @Autowired
    public MessageController(DailyPasswordDAO DailyPasswordDAO, DailyMessageDAO dailyMessageDAO) {
        this.dailyPasswordDAO = DailyPasswordDAO;
        this.dailyMessageDAO = dailyMessageDAO;
    }

    @InitBinder("messagePassword")
    protected void initMessageBinder(WebDataBinder binder) {
        binder.addValidators(new MessagePasswordValidator());
    }

    @GetMapping("/cube")
public String getCube(){
        return "gifts/touch";
    }
    @PostMapping(value = "/message")
    public String performMessagePassword(@Valid @ModelAttribute("messagePassword") MessagePassword messagePassword, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "messageLogin";
        }
        DailyMessage dailyMessage = new DailyMessage();
        dailyMessage.setDay(PasswordController.actualDay);
        dailyMessage.setMessage(dailyMessageDAO.findMessageByDay(PasswordController.actualDay));
        model.addAttribute("dailyMessage", dailyMessage);
        String returnSite = giftSelector(PasswordController.actualDay);
        return returnSite;
    }

    @GetMapping(value = "/message")
    public String getMessage(HttpServletRequest request, Model model) {
        model.addAttribute("messagePassword", new MessagePassword());
        PasswordController.actualDay = Integer.parseInt(request.getParameter("day"));
        PasswordController.actualPassword = dailyPasswordDAO.findPasswordByDay(PasswordController.actualDay);
        return "messageLogin";
    }

    private String giftSelector(int actualDay) {
        switch (actualDay) {
            case 2:
                return "gifts/giftWithPictureDay2";
            case 5:
                return "gifts/giftWithPictureDay5";
            case 11:
                return "gifts/giftWithPictureDay11";
            default:
                return "gifts/gift";
        }
    }
}


