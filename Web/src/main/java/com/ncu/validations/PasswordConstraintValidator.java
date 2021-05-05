package com.ncu.validations;


	import javax.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
	public class PasswordConstraintValidator
		implements ConstraintValidator<Password, String> {
			
		    String regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
		    Pattern p = Pattern.compile(regex);
		    
			@Override
		
			public void initialize(Password thePassword) {
				// TODO Auto-generated method stub
				thePassword.message();
			}

			@Override
			public boolean isValid(String value, ConstraintValidatorContext context) {
				// TODO Auto-generated method stub
				if (value == null) {
		            return false;
		        }
		  
		       Matcher m = p.matcher(value);
		        return m.matches();
		    }
	}