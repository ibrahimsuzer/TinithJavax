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

import Euler.Lib.Factor;
import Euler.Lib.TriangleNumber;

/**
 *
 * @author Tinithraviel
 */
public class Euler_012 {

    public static void main(String[] args) {

        Factor A = new Factor();
        TriangleNumber B = new TriangleNumber();
        A.arrayedPrimeFactorization(5);
        System.out.print(A.arrayedPrimeFactorization(3).length);
/*
        int k;
        for (k = 0; A.numberOfFactors(B.xthTN(k)) < 6; k++) {
            System.out.println(k);
        }

        System.out.print(k + "th : " + B.xthTN(k) + "(" + A.numberOfFactors(B.xthTN(k)) + ")" + " : ");

        int m[] = A.arrayedFactors(B.xthTN(k));

        for (int i = 0; m.length > i; i++) {
            System.out.print(m[i] + "-");
        }

    }
*/
}
