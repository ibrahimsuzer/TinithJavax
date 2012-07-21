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

public class LinkedList<T> {
    Node<T> first;

    public LinkedList() {
	first = null;
    }

    public void addLast(T val) {
	Node<T> newNode = new Node<T>(val);
	if (first == null) {
	    first = newNode;
	    return;
	}
	Node<T> i;
	for (i = first; i.next != null; i = i.next)
	    ;
	i.next = newNode;
    }

    public Node<T> removeFirst() throws Exception {
	if (first == null) {
	    throw new Exception("List is empty");
	}
	Node<T> temp = first;
	first = first.next;
	temp.next = null;
	return temp;
    }

    public Node<T> removeLast() throws Exception {
	Node<T> n, temp = null;
	if (first == null) {
	    throw new Exception("List is empty");
	}
	if (first.next == null) {
	    temp = first;
	    first = null;
	    return temp;
	}
	for (n = first; n.next != null; n = n.next) {
	    temp = n;
	}
	temp.next = null;
	return n;
    }

    public void display() {
	for (Node<T> n = first; n != null; n = n.next) {
	    System.out.println(n.data);
	}
    }
}
