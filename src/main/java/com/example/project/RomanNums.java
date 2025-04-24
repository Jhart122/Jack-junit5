/*
 * Copyright 2015-2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

	
public class RomanNums {
    public static String ArabtoRoman(int number) {
		StringBuilder result = new StringBuilder();
		int remaining = number;

		if (remaining >= 5){
			result.append("V");
			remaining -= 5;
		}
		if (remaining == 4) {
			result.append("IV");
			remaining -= 4;
		}
		for (int i =0; i < remaining; i++) {
				result.append("I");
			}	
		return result.toString();
}
}
