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
package CE242_Assignment_4;

public class Node<T> {
    T data;
    Node<T> right;
    Node<T> left;

    public Node(T elem) {
	/* Codes are HERE */
	this.data = elem;
	this.right = null;
	this.left = null;
    }
}
