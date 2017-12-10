package com.norbisite.validation;

import com.norbisite.domain.LoginPassword;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class LoginPasswordValidator implements Validator {

    public boolean supports(Class clazz) {
        return LoginPassword.class.equals(clazz);
    }


    @Override
    public void validate(Object target, Errors errors) {
        if(target != null){
            LoginPassword loginPassword = (LoginPassword) target;
            if(!loginPassword.getPassword().equals("39")){
                errors.rejectValue("password","wrong.loginPassword");
            }
        }
    }
}
