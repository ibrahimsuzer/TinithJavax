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

public class BSTree<T extends Comparable<T>> {
    Node<T> root;

    public BSTree() {
	/* Codes are HERE */
	this.root = null;
    }

    Node<T> insert(T elem, Node<T> n) {
	/* Codes are HERE */
	if (n == null) {
	    n = new Node<>(elem);
	} else if (elem.compareTo(n.data) < 0) {
	    n.left = insert(elem, n.left);
	} else if (elem.compareTo(n.data) > 0) {
	    n.right = insert(elem, n.right);
	} else
	    ;
	return n;
    }

    public void displayInordered(Node<T> n) {
	/* Codes are HERE */
	if (n == null) {
	    return;
	}
	if (n.left != null) {
	    displayInordered(n.left);
	}
	System.out.println(n.data.toString());
	if (n.right != null) {
	    displayInordered(n.right);
	}
    }
}
