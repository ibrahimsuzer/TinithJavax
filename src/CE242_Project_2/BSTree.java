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
package CE242_Project_2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BSTree<T extends Comparable<T>> {
    Node<T> root;

    public BSTree() {
	root = null;
    }

    public Node<T> insert(T elem, Node<T> n) {
	/* Codes are HERE */
	if (n == null) {
	    n = new Node<>(elem);
	} else if (elem.compareTo(n.data) == -1) {
	    n.left = insert(elem, n.left);
	} else if (elem.compareTo(n.data) == 1) {
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

    public void displayPreOrder(Node<T> n) {
	/* Codes are HERE */
	if (n == null) {
	    return;
	}
	System.out.println(n.data.toString());
	if (n.left != null) {
	    displayInordered(n.left);
	}
	if (n.right != null) {
	    displayInordered(n.right);
	}
    }

    public void displayPostOrder(Node<T> n) {
	/* Codes are HERE */
	if (n == null) {
	    return;
	}
	if (n.left != null) {
	    displayInordered(n.left);
	}
	if (n.right != null) {
	    displayInordered(n.right);
	}
	System.out.println(n.data.toString());
    }

    public void writeStudentRecordsOrdered(Node<T> n) {
	/* Codes are HERE */
	try {
	    if (n == null) {
		return;
	    }
	    if (n.left != null) {
		writeStudentRecordsOrdered(n.left);
	    }
	    if (n.right != null) {
		writeStudentRecordsOrdered(n.right);
	    }
	    String studentInfo = n.data.toString();
	    FileWriter fwriter = new FileWriter("student.txt", true);
	    try (BufferedWriter bw = new BufferedWriter(fwriter)) {
		bw.write(studentInfo);
		bw.newLine();
	    }
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    public Node<T> removeStudent(Student s) {
	/* Codes are HERE */
	Node<T> node = root;
	Node<T> parent = null;
	Node<T> child = null;
	while (node != null && node.data != s) { // move until you find s or you
						 // fail
	    parent = node;
	    if (s.compareTo(node.data) == -1) {
		node = node.left;
	    } else {
		node = node.right;
	    }
	}
	if (node == null) { // failure to find node with s data
	    return null;
	}
	if (node.left == null && node.right == null) { // No Child Situation
	    if (parent == null) { // never moved
		root = null;
	    } else if (s.compareTo(parent.data) == -1) { // moved to left
		parent.left = null;
	    } else { // moved to right
		parent.right = null;
	    }
	    return node;
	} else if (node.left == null) { // Right Child Situation
	    child = node.right; // branch to be saved
	    T temp = node.data; // swap datas of child & node
	    node.data = child.data;
	    child.data = temp;
	    node.left = child.left; // copy branches of child to node(swapped
				    // data with child)
	    node.right = child.right;
	    return child;
	} else if (node.right == null) { // Left Child Situation
	    child = node.left; // branch to be saved
	    T temp = node.data; // swap datas of child & node
	    node.data = child.data;
	    child.data = temp;
	    node.left = child.left; // copy branches of child to node(swapped
				    // data with child)
	    node.right = child.right;
	    return child;
	} else { // Two Children Situation
	    child = node.left;
	    parent = null;
	    while (child.right != null) {
		parent = child;
		child = parent.right;
	    }
	    if (parent == null) { // Already Nothing at right
		T temp = node.data; // swap datas of child & node
		node.data = child.data;
		child.data = temp;
		node.left = child.left; // move left branch 1 level up
		return child;
	    } else { // We went to rightmost of left branch
		T temp = node.data;
		node.data = child.data;
		child.data = temp;
		parent.right = child.left; // we are already at rightmost of
					   // branch so we only copy left one to
					   // parent(which is 1 level above)
		return child;
	    }
	}
    }

    public Node<T> findMinElem() {
	/* Code are HERE */
	Node<T> n = root;
	if (root == null) {
	    return null;
	}
	while (n.left != null) {
	    n = n.left;
	}
	return n;
    }

    public Node<T> findMaxElem() {
	/* Codes are HERE */
	Node<T> n = root;
	if (root == null) {
	    return null;
	}
	while (n.right != null) {
	    n = n.right;
	}
	return n;
    }
}
