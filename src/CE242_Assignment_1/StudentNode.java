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

public class StudentNode {
    Student student;
    StudentNode next;

    public StudentNode(Student std) {
	this.student = std;
	this.next = null;
    }
}
