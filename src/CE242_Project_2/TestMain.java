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

import java.util.Scanner;

public class TestMain {
    /**
     * @author aykut DO NOT Modify the MAIN METHOD and STUDENT.TXT File
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
	int i = 1;
	String name, lname;
	long id;
	Scanner scn = new Scanner(System.in);
	BSTree tree = new BSTree();
	while (i <= 5) {
	    System.out.println("Enter a student name: ");
	    name = scn.next();
	    System.out.println("Enter a lastname: ");
	    lname = scn.next();
	    System.out.println("Enter an id: ");
	    id = scn.nextLong();
	    System.out.println("----------------------------------");
	    tree.root = tree.insert(new Student(name, lname, id), tree.root);
	    i++;
	}
	tree.displayInordered(tree.root);
	tree.writeStudentRecordsOrdered(tree.root);
	System.out.println("Min Elem of BST: " + tree.findMinElem().data.toString());
	System.out.println("Max Elem of BST: " + tree.findMaxElem().data.toString());
	tree.removeStudent((Student) tree.findMinElem().data);
	tree.displayPreOrder(tree.root);
    }
}
