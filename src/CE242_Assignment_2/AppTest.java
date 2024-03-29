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
package CE242_Assignment_2;

public class AppTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
	String s1 = "Ali";
	String s2 = "Veli";
	String s3 = "Yasemin";
	String s4 = "Hande";
	String s5 = "Cansu";
	String s6 = "Bugra";
	DList myDList = new DList();
	myDList.insertOrdered(s1);
	myDList.insertOrdered(s2);
	myDList.insertOrdered(s3);
	myDList.insertOrdered(s4);
	myDList.insertOrdered(s5);
	myDList.insertOrdered(s6);
	System.out.println("DISPLAY THE LIST IN ORDERED...");
	myDList.displayList();
	System.out.println("SEARCH and DISPLAY ALL ELEMENTS BEFORE THE KEY ELEMENT...");
	myDList.displayListBeforeKey("yasemin");
	DNode dn = myDList.remove(s4);
	if (dn == null) {
	    System.out.println("COULD NOT REMOVE THE KEY");
	} else {
	    System.out.println("REMOVED: " + dn.data);
	}
	myDList.displayList();
	System.out.println("-");
	myDList.removeElem('Y');
	myDList.displayList();
    }
}
