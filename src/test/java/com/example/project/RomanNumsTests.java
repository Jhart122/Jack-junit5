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
    void testOneToI() {
        assertEquals("I", RomanNums.ArabtoRoman(1));
    }

    @Test
    void testTwoToII() {
        assertEquals("II", RomanNums.ArabtoRoman(2));
    }

    @Test
    void testFourToIV() {
        assertEquals("IV", RomanNums.ArabtoRoman(4));
    }

    @Test
    void testFiveToV() {
        assertEquals("V", RomanNums.ArabtoRoman(5));
    }

	@Test 
	void testSixToVI() {
		assertEquals("VI", RomanNums.ArabtoRoman(6));
	}
}
		

