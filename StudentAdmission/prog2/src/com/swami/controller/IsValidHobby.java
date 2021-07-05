package com.swami.controller;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
 
@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Target( { ElementType.FIELD })//The @Target annotation describes where you can apply your custom annotation:method and fields
@Retention(RetentionPolicy.RUNTIME)//The @Retention annotation describes if the custom annotation should be available in the byte code
public @interface IsValidHobby {
	
    String message() default "Please provide a valid Hobby; " +
    		"accepted hobbies are - Music, Football, Cricket and Hockey ( choose anyone )";
      
    Class<?>[] groups() default {};//used with @Constraint to customize the targeted groups
      
    Class<? extends Payload>[] payload() default {};////used with @Constraint for extensibility purpose
       
}