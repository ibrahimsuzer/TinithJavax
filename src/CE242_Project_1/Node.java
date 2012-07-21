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

public class Node<T> {
    public T data;
    public Node<T> next;
    public Node<T> prev;

    public Node(T elem) {
	this.data = elem;
	this.next = null;
	this.prev = null;
	// Code are here
    }

    public T getData() {
	return data;
    }

    public void setData(T data) {
	this.data = data;
    }

    public Node<T> getNext() {
	return next;
    }

    public void setNext(Node<T> next) {
	this.next = next;
    }

    public Node<T> getPrev() {
	return prev;
    }

    public void setPrev(Node<T> prev) {
	this.prev = prev;
    }
}
