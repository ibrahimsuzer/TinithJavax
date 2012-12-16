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
package StackAndQueueGenerics;

public class Application {
    public static void main(String[] args) {
	/*
	 * LinkedList<String> myList = new LinkedList<String>();
	 * 
	 * myList.addLast("aykut"); myList.addLast("veli");
	 * myList.addLast("ayse");
	 * 
	 * myList.display();
	 * 
	 * 
	 * LinkedList<Double> myList2 = new LinkedList<Double>();
	 * myList2.addLast(3.14); myList2.addLast(2.718);
	 * myList2.addLast(11.789);
	 * 
	 * myList2.display();
	 */
	/*
	 * try { myList.removeLast(); } catch (Exception e) {
	 * 
	 * //e.printStackTrace();
	 * System.out.println("Liste bos elemen cikaramazasin"); }
	 * 
	 * myList.display();
	 * 
	 * 
	 * LinkedList<Double> myList2 = new LinkedList<Double>();
	 * myList2.addLast(3.14); myList2.addLast(2.718);
	 * 
	 * myList2.display();
	 * 
	 * try { myList2.removeFirst(); } catch (Exception e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * 
	 * myList2.display();
	 * 
	 * 
	 * 
	 * Stack<Integer> myStack = new Stack<Integer>();
	 * 
	 * myStack.push(21); myStack.push(64); myStack.push(34);
	 * myStack.push(22);
	 * 
	 * try { System.out.println(myStack.pop().data);
	 * System.out.println(myStack.pop().data);
	 * System.out.println(myStack.pop().data);
	 * System.out.println(myStack.pop().data);
	 * 
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * Queue<String> q = new Queue<String>();
	 * 
	 * q.enqueue("erkin"); q.enqueue("baris"); q.enqueue("cem");
	 * q.enqueue("uc hurel");
	 * 
	 * 
	 * try { System.out.println(q.dequeue().data);
	 * //System.out.println(q.dequeue().data);
	 * //System.out.println(q.dequeue().data);
	 * //System.out.println(q.dequeue().data);
	 * //System.out.println(q.dequeue().data);
	 * 
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 */
	/*
	 * Stack<String> s = new Stack<String>();
	 * 
	 * s.push("cem"); s.push("baris"); s.push("erkin");
	 * 
	 * try { System.out.println(s.pop().data);
	 * System.out.println(s.pop().data); System.out.println(s.pop().data);
	 * //System.out.println(s.pop().data); } catch (Exception e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * 
	 * Stack<Integer> s2 = new Stack<Integer>();
	 * 
	 * s2.push(21); s2.push(22); s2.push(64); s2.push(34);
	 * 
	 * try { System.out.println(s2.pop().data); } catch (Exception e) { //
	 * TODO Auto-generated catch block e.printStackTrace(); }
	 * 
	 * 
	 * 
	 * Queue<Character> q = new Queue<Character>();
	 * 
	 * q.enqueue('a'); q.enqueue('b'); q.enqueue('c');
	 * 
	 * try { System.out.println(q.dequeue().data); } catch (Exception e) {
	 * // TODO Auto-generated catch block e.printStackTrace(); }
	 */
	Stack<String> s = new Stack<String>();
	s.push("aykut");
	s.push("caner");
	s.push("ali");
	s.push("ayse");
	try {
	    System.out.println(s.pop().data);
	    System.out.println(s.pop().data);
	    System.out.println(s.pop().data);
	    System.out.println(s.pop().data);
	    System.out.println(s.pop().data);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
}
