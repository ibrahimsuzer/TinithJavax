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

public class Stack {
    int[] arr;
    int top;
    int cap;

    public Stack(int cap) {
	this.cap = cap;
	arr = new int[cap];
	top = -1;
    }

    public void push(int val) throws Exception {
	if (top + 1 == cap) {
	    throw new Exception("Stack is full");
	}
	top++;
	arr[top] = val;
    }

    public int pop() throws Exception {
	if (top == -1) {
	    throw new Exception("Stack is empty");
	}
	top--;
	return arr[top + 1];
    }

    public int peek() {
	return arr[top];
    }
}
