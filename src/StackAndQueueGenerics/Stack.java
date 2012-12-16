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
package StackAndQueueGenerics;

public class Stack<T> {
    private LinkedList<T> myList;

    public Stack() {
	myList = new LinkedList<T>();
    }

    public void push(T val) {
	myList.addLast(val);
    }

    public Node<T> pop() throws Exception {
	return myList.removeLast();
    }
}
