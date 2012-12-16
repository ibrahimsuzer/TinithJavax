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
package CE242_Assignment_1;

public class StudentList {
    StudentNode first;

    public StudentList() {
	first = null;
    }

    public void displayStudentList() {
	for (StudentNode n = first; n != null; n = n.next) {
	    System.out.printf("ID: %d \t Name: %s \t Surname: %s \n", n.student.id, n.student.name, n.student.surname);
	}
    }

    public void addFirst(Student s) {
	StudentNode newStudentNode = new StudentNode(s);
	if (first == null) {
	    first = newStudentNode;
	    return;
	}
	newStudentNode.next = first;
	first = newStudentNode;
    }

    public void addLast(Student s) {
	StudentNode newStudentNode = new StudentNode(s);
	if (first == null) {
	    first = newStudentNode;
	    return;
	}
	StudentNode cur = first;
	for (StudentNode i = first; i != null; i = i.next) {
	    cur = i;
	}
	cur.next = newStudentNode;
    }

    public StudentNode removeLast() {
	if (first == null) {
	    return null;
	}
	StudentNode cur = null;
	StudentNode prev = null;
	for (StudentNode i = first; i.next != null; i = i.next) {
	    prev = i;
	    cur = i.next;
	}
	if (first.next == null) {
	    first = null;
	    return prev;
	}
	prev.next = null;
	return cur;
    }

    public StudentNode remove(Student s) {
	if (first == null) {
	    return null;
	}
	StudentNode cur = first;
	StudentNode prev = null;
	for (StudentNode i = first; i.student.id != s.id; i = i.next) {
	    prev = cur;
	    cur = cur.next;
	}
	if (prev == null) {
	    first = cur.next;
	    cur.next = null;
	} else {
	    prev.next = cur.next;
	    cur.next = null;
	}
	return cur;
    }
}
