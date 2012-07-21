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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestMain {
    /**
     * @author aykut DO NOT Modify the MAIN METHOD and STUDENT.TXT File
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
	BSTree tree = new BSTree();
	try {
	    FileReader freader = new FileReader("student.txt");
	    BufferedReader br = new BufferedReader(freader);
	    String studentInfo;
	    while ((studentInfo = br.readLine()) != null) {
		String[] str = studentInfo.split(" ");
		tree.root = tree.insert(new Student(str[1], str[2], Long.parseLong(str[0])), tree.root);
	    }
	    tree.displayInordered(tree.root);
	    freader.close();
	    br.close();
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
