package com.ncu.validations;

import javax.validation.ConstraintValidatorContext;
import javax.validation.ConstraintValidator;
public class CourseCodeConstraintValidator 
	implements ConstraintValidator<CourseCode, String> {
		private String[] coursePrefix;
		@Override
		public void initialize(CourseCode theCourseCode) {
			// TODO Auto-generated method stub
			coursePrefix = theCourseCode.value();
			System.out.println(coursePrefix);
		}

		@Override
		public boolean isValid(String value, ConstraintValidatorContext context) {
			// TODO Auto-generated method stub
			
			System.out.println(value);
			boolean result = false;
			if(value!=null) {
				for(String s:coursePrefix) {
					result = value.startsWith(s);
					if (result) {

						  break;  }

						}
				}
			
			else {
				result=true;
			}
			
			return result;
		}

}
