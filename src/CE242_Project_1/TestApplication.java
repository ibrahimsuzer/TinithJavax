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
package CE242_Project_1;

public class TestApplication {
    public static int evaluateMath(String exp) {
	int total = 0;
	Stack<Integer> myStack = new Stack<>();
	try {
	    for (int i = 0; i < exp.length(); i++) {
		switch (exp.charAt(i)) {
		case '0':
		    myStack.push(0);
		    break;
		case '1':
		    myStack.push(1);
		    break;
		case '2':
		    myStack.push(2);
		    break;
		case '3':
		    myStack.push(3);
		    break;
		case '4':
		    myStack.push(4);
		    break;
		case '5':
		    myStack.push(5);
		    break;
		case '6':
		    myStack.push(6);
		    break;
		case '7':
		    myStack.push(7);
		    break;
		case '8':
		    myStack.push(8);
		    break;
		case '9':
		    myStack.push(9);
		    break;
		case '+':
		    int a = myStack.pop().getData();
		    int b = myStack.pop().getData();
		    myStack.push(b + a);
		    break;
		case '-':
		    a = myStack.pop().getData();
		    b = myStack.pop().getData();
		    myStack.push(b - a);
		    break;
		case '*':
		    a = myStack.pop().getData();
		    b = myStack.pop().getData();
		    myStack.push(b * a);
		    break;
		case '/':
		    a = myStack.pop().getData();
		    b = myStack.pop().getData();
		    myStack.push(b / a);
		    break;
		default:
		    break;
		}
		myStack.display();
		System.out.println("");
	    }
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
	try {
	    total = myStack.pop().getData();
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
	return total;
    }

    public static void main(String[] args) {
	String mathExpression = "53-7*84/74-*+";// Postfix notation of (5 - 3) *
						// 7 + (8 / 4) * (7 - 4)
	int result = evaluateMath(mathExpression);
	System.out.printf("%s postfix expression result= %d\n", mathExpression, result);
    }
}
