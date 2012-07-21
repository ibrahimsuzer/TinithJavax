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

@SuppressWarnings("rawtypes")
public class Student implements Comparable {
    String name;
    String lastName;
    long id;

    public Student(String name, String lastName, long id) {
	this.name = name;
	this.lastName = lastName;
	this.id = id;
    }

    @Override
    public int compareTo(Object s) {
	/* Codes are HERE */
	return name.compareTo(s.toString());
    }

    @Override
    public String toString() {
	return name;
    }
}
