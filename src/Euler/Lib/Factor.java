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
package Euler.Lib;

/**
 * 
 * @author Tinithraviel
 */
public class Factor {
    public int[] arrayedFactors(int x) {
	int[] y = new int[600];
	int k = 0;
	for (int i = 1; i <= x; i++) {
	    if (x % i == 0) {
		y[k] = i;
		k++;
	    }
	}
	return y;
    }

    public int[] arrayedPrimeFactorization(int x) {
	int k = 0;
	for (int i = 1; i <= x; i++) {
	    if (prime(i)) {
		k++;
	    }
	}
	k--;
	int[] y = new int[k];
	k = 0;
	for (int i = 1; i <= x; i++) {
	    if (prime(i)) {
		y[k] = i;
		k++;
	    }
	}
	return y;
    }

    public boolean prime(int x) {
	for (int i = 2; i < x; i++) {
	    if (x % i == 0) {
		return false;
	    }
	}
	return true;
    }

    public int numberOfFactors(int x) {
	int[] z = arrayedPrimeFactorization(x);
	int j = 1;
	for (int i = 1; i < z.length; i++) {
	    j *= (z[i] + 1);
	}
	return j;
    }
}
