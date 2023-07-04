package com.bhubanananda.accessmodifier.defaultaccess;

import com.bhubanananda.accessmodifier.test.PrivaeAccessHelper;

/**
 * The Class PrivaeAccessModifire.
 * 
 * @ author Bhubanananda
 */
public class PrivaeAccessModifire {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		PrivaeAccessHelper privaeAccessHelper = new PrivaeAccessHelper();
//		privaeAccessHelper.i; //Compile Time Error  
		privaeAccessHelper.display();

	}
}
