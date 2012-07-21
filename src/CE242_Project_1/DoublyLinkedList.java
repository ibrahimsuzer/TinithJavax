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

public class DoublyLinkedList<T> {
    private Node<T> first;

    public DoublyLinkedList() {
	first = null;
	// Codes are here
    }

    public void addLast(T elem) {
	Node<T> newNode = new Node<>(elem);
	if (getFirst() == null) {
	    setFirst(newNode);
	    return;
	}
	Node<T> i;
	for (i = getFirst(); i.getNext() != null; i = i.getNext())
	    ;
	i.setNext(newNode);
	newNode.setPrev(i);
	// Codes are here
    }

    public Node<T> removeLast() throws Exception {
	Node<T> a;
	Node<T> temp;
	if (getFirst() == null) {
	    throw new Exception("System is empty");
	}
	if (getFirst().getNext() == null) {
	    temp = getFirst();
	    setFirst(null);
	    return temp;
	}
	for (a = getFirst(); a.getNext() != null; a = a.getNext()) {
	    ;
	}
	temp = a;
	temp.prev.setNext(null);
	temp.setPrev(null);
	return a;
	// Code are here
    }

    public void display() {
	for (Node<T> n = getFirst(); n != null; n = n.getNext()) {
	    System.out.println(n.getData());
	}
    }

    public Node<T> getFirst() {
	return first;
    }

    public void setFirst(Node<T> first) {
	this.first = first;
    }
}
