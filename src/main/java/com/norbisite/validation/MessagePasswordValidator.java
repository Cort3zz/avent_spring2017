package com.norbisite.validation;

import com.norbisite.controller.PasswordController;
import com.norbisite.domain.MessagePassword;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


public class MessagePasswordValidator implements Validator {

    public MessagePasswordValidator() {
    }


    public boolean supports(Class clazz) {
        return MessagePassword.class.equals(clazz);
    }


    @Override
    public void validate(Object target, Errors errors) {
        if(target != null){
            MessagePassword messagePassword = (MessagePassword) target;
            if(!messagePassword.getPassword().equals(PasswordController.actualPassword)){
                errors.rejectValue("password","wrong.messagePassword");
            }
        }
    }
}
