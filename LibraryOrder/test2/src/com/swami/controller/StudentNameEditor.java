package com.swami.controller;
import java.beans.PropertyEditorSupport;
public class StudentNameEditor extends PropertyEditorSupport{

		@Override
		public void setAsText(String studentName)throws IllegalArgumentException {
					
			if(studentName.contains("Mr.")) {

				setValue(studentName);
			
			} else {

				studentName = "Mr."+studentName;
				
				setValue(studentName);  
			}
		}
}
