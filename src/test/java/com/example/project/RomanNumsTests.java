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

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumsTests {

	@Test
	void OnetoI() {
		RomanNums converter = new RomanNums();
		String result = converter.ArabtoRoman(1);
		assertEquals("I", result);
	}
	@Test 
	void TwotoII() {
		RomanNums converter = new RomanNums();
		String result = converter.ArabtoRoman(2);
		assertEquals("II", result);
	}
	@Test 
	void FourtoIV() {
		RomanNums converter = new RomanNums();
		String result = converter.ArabtoRoman(4);
		assertEquals("IV", result);
	}
	//@Test
	//void FivetoV() {
	//	RomanNums converter = new RomanNums();
	//	String result = converter.ArabtoRoman(5);
	//	assertEquals("V", result);
	//}
		
}

