package com.ncu.validations;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import javax.validation.Constraint;
import javax.validation.Payload;



@Constraint(validatedBy =  PasswordConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface  Password {

	// define default course code
//	public String value() default "CSE";
	public String[] value() default "";
	// define default error message
	public String message() default "it doesn't match the requirements";
	
	// define default groups
	public Class<?>[] groups() default {};
	
	// define default payloads
	public Class<? extends Payload>[] payload() default {};


}



