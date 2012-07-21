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
package BinaryTree;

public class BinaryTree {
    Node root;

    public BinaryTree() {
	root = null;
    }

    public Node add(int val) {
	Node n = new Node(val);
	if (root == null) {
	    root = n;
	    return null;
	}
	if (root.data < val) {
	    root.right = add(val);
	} else {
	    root.left = add(val);
	}
	return n;
    }

    public static void preOrderDisplay(Node r) {
	if (r == null) {
	    return;
	}
	System.out.println(r.data);
	preOrderDisplay(r.left);
	preOrderDisplay(r.right);
    }
}
