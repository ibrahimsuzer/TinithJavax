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

public class DList {
    DNode first;

    public DList() {
	first = null;
    }

    public void insertOrdered(String val) {
	DNode newNode = new DNode(val);
	if (first == null) {
	    first = newNode;
	    return;
	}
	DNode cur1 = null;
	DNode cur2 = first;
	if (val.compareTo(cur2.data) < 0) {
	    first = newNode;
	    first.next = cur2;
	    cur2.prev = first;
	    return;
	}
	while (val.compareTo(cur2.data) >= 0) {
	    cur1 = cur2;
	    cur2 = cur2.next;
	    if (cur2 == null) {
		cur1.next = newNode;
		newNode.prev = cur1;
		return;
	    }
	}
	cur1.next = newNode;
	cur2.prev = newNode;
	newNode.next = cur2;
	newNode.prev = cur1;
	// Codes are here
    }

    public DNode removeFirst() {
	if (first == null) {
	    return null;
	}
	first = first.next;
	first.prev.next = null;
	DNode temp = first.prev;
	first.prev = null;
	return temp;
	// Codes are here
    }

    public DNode remove(String deleted) {
	if (first == null) {
	    return null;
	}
	if (first.data.equals(deleted)) {
	    return this.removeFirst();
	}
	DNode cur;
	for (cur = first; !cur.data.equals(deleted); cur = cur.next) {
	    if (cur == null) {
		return null;
	    }
	}
	// if(cur.prev != null)
	cur.prev.next = cur.next;
	if (cur.next != null) {
	    cur.next.prev = cur.prev;
	}
	cur.next = null;
	cur.prev = null;
	return cur;
	// Codes are here
    }

    public void displayListBeforeKey(String key) {
	DNode cur;
	for (cur = first; !cur.data.equalsIgnoreCase(key); cur = cur.next) {
	    if (cur == null) {
		return;
	    }
	}
	cur = cur.prev;
	while (cur != null) {
	    System.out.println(cur.data);
	    cur = cur.prev;
	}
    }

    public void displayList() {
	for (DNode dn = first; dn != null; dn = dn.next) {
	    System.out.println(dn.data);
	}
    }

    public void removeElem(char y) {
	DNode cur;
	for (cur = first; cur != null; cur = cur.next) {
	    for (int i = 0; i != cur.data.length() - 1; i++) {
		if (cur.data.charAt(i) == y) {
		    this.remove(cur.data);
		}
	    }
	}
    }
}
