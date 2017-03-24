/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.generatepdf;

/**
 *
 * @author Erwin
 */
public class numberValidator {
    
    /**
     *
     * @param numberToTest
     * @return 
     */
    public static boolean validateNumber(String numberToTest, int lengths) {
		//validate phone numbers of format "1234567890"
		if (numberToTest.matches("\\d{"+lengths+"}")) return true;
		//validating phone number with -, . or spaces
		else if(numberToTest.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{3}")) return true;
		//validating phone number with extension length from 3 to 5
		else if(numberToTest.matches("\\d{3}-\\d{3}-\\d{3}\\s(x|(ext))\\d{3,5}")) return true;
		//validating phone number where area code is in braces ()
		else if(numberToTest.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;
		//return false if nothing matches the input
		else return false;
		
	}

}