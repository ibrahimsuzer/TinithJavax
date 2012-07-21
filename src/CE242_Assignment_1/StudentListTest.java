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

public class StudentListTest {
    public static void main(String[] args) {
	Student s1 = new Student("Ali", "Velioglu", 123);
	Student s2 = new Student("Havva", "Havvakizi", 64);
	Student s3 = new Student("Adem", "Ademoglu", 21);
	Student s4 = new Student("Ayse", "Ok", 45);
	Student s5 = new Student("Yasin", "Buyuk", 145);
	StudentList sList = new StudentList();
	sList.addFirst(s1);
	sList.addFirst(s2);
	sList.addLast(s3);
	sList.addLast(s4);
	sList.addLast(s5);
	System.out.println("STUDENT LIST...");
	sList.displayStudentList();
	System.out.println("REMOVING IS PROCESSED...");
	StudentNode deleted = sList.removeLast();
	if (deleted == null) {
	    System.out.println("ERROR: THE LIST IS EMPTY!");
	} else {
	    System.out.println("DELETED STUDENT ID(LAST): " + deleted.student.id);
	}
	System.out.println("DELETE ANY STUDENT FROM THE LIST...");
	deleted = sList.remove(s3);
	if (deleted == null) {
	    System.out.printf("ERROR: COULD NOT FIND %d %s %s \n", deleted.student.id, deleted.student.name, deleted.student.surname);
	}
	System.out.println("NEW LIST AFTER DELETION PROCESSES");
	sList.displayStudentList();
    }
}
