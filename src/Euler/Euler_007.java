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
/*
 * Copyright (C) 2012 Tinithraviel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Euler;

/**
 * 
 * @author Tinithraviel
 */
public class Euler_007 {
    public static void main(String[] args) {
	System.out.println("sol : " + xthPrime(10001));
    }

    public static int xthPrime(int x) {
	int count = 0;
	int last = 1;
	for (int i = 1; count <= x; i++) {
	    if (prime(i)) {
		last = i;
		count++;
	    }
	}
	return last;
    }

    public static boolean prime(int x) {
	for (int i = 2; i < x; i++) {
	    if (x % i == 0) {
		return false;
	    }
	}
	return true;
    }
}
