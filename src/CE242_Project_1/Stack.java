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

public class Stack<T> {
    private DoublyLinkedList<T> list;

    public Stack() {
	list = new DoublyLinkedList<>();
	// Codes are here
    }

    public void push(T elem) {
	list.addLast(elem);
	// Codes are here
    }

    public Node<T> pop() throws Exception {
	return list.removeLast();
    }

    public void display() {
	list.display();
    }
}
