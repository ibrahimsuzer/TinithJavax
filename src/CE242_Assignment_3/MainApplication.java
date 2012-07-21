/*******************************************************************************
 * Copyright (c) 2012 Ibrahim Suzer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Ibrahim Suzer - initial API and implementation
 ******************************************************************************/
package CE242_Assignment_3;

public class MainApplication {
    public static void main(String[] args) {
	Stack myStack = new Stack(4);
	try {
	    myStack.push(21);
	    myStack.push(64);
	    myStack.push(22);
	    myStack.push(34);
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
	System.out.printf("Top of Stack: %d\n", myStack.peek());
	try {
	    myStack.pop();
	    myStack.pop();
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	System.out.printf("Top of Stack: %d\n", myStack.peek());
    }
}
