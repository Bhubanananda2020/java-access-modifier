package com.bhubanananda.accessmodifier.defaultaccess;

import com.bhubanananda.accessmodifier.test.DefaultAccessHelper;

/**
 * The Class DefaultAccessModifier.
 * 
 * @ author Bhubanananda
 */
public class DefaultAccessModifier {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		DefaultAccessHelper defaultAccessHelper = new DefaultAccessHelper();
//		defaultAccessHelper.display(); //Compile Time Error  

		DefaultAccessHelper2 defaultAccessHelper2 = new DefaultAccessHelper2();
		defaultAccessHelper2.display();

	}
}
