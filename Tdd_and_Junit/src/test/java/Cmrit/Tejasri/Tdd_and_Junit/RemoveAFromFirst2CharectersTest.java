package Cmrit.Tejasri.Tdd_and_Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAFromFirst2CharectersTest {
	
	/*
	 * TODO list:
	 * 1. 1 char  : -> A => ""
	 * 			    -> B => B
	 * 2. 2 chars : -> AA => ""
	 * 				-> AB => B
	 * 				-> BA => B
	 * 				-> BC => BC
	 * 3. 3 chars : -> AAA => A
	 * 				-> AAB => B
	 * 				-> ABC => BC
	 * 				-> BAC => BC
	 * 				-> BDC => BDC
	 * 				-> BCA => BCA
	 * 4. empty char : "" => ""
	 * 5. n chars : -> AAETSJFYFJJD => ETSJFYFJJD
	 * 				-> BAETSJFYFJJD => BETSJFYFJJD
	 * 				-> SJTETSJFYFJJD => SJTETSJFYFJJD
	 */
	RemoveAFromFirst2Charecters removeAFromFirst2Charecters;
	@BeforeEach
	void initial() {
		removeAFromFirst2Charecters = new RemoveAFromFirst2Charecters();
	}
	
	@Test
	void testA() {
		assertEquals("", removeAFromFirst2Charecters.removeA("A"));
	}
	@Test
	void testemptyChar() {
		assertEquals("", removeAFromFirst2Charecters.removeA(""));
	}
	@Test
	void testB() {
		assertEquals("B", removeAFromFirst2Charecters.removeA("B"));
	}
	@Test
	void testAA() {
		assertEquals("", removeAFromFirst2Charecters.removeA("AA"));
	}
	@Test
	void testAB() {
		assertEquals("B", removeAFromFirst2Charecters.removeA("AB"));
	}
	@Test
	void testBA() {
		assertEquals("B", removeAFromFirst2Charecters.removeA("BA"));
	}
	@Test
	void testBC() {
		assertEquals("BC", removeAFromFirst2Charecters.removeA("BC"));
	}
	@Test
	void testAAA() {
		assertEquals("A", removeAFromFirst2Charecters.removeA("AAA"));
	}
	@Test
	void testAAB() {
		assertEquals("B", removeAFromFirst2Charecters.removeA("AAB"));
	}
	@Test
	void testABC() {
		assertEquals("BC", removeAFromFirst2Charecters.removeA("ABC"));
	}
	@Test
	void testBAC() {
		assertEquals("BC", removeAFromFirst2Charecters.removeA("BAC"));
	}
	@Test
	void testBDC() {
		assertEquals("BDC", removeAFromFirst2Charecters.removeA("BDC"));
	}
	@Test
	void testBCA() {
		assertEquals("BCA", removeAFromFirst2Charecters.removeA("BCA"));
	}
	@Test
	void testAAETSJFYFJJD() {
		assertEquals("ETSJFYFJJD", removeAFromFirst2Charecters.removeA("AAETSJFYFJJD"));
	}
	@Test
	void testBAETSJFYFJJD() {
		assertEquals("BETSJFYFJJD", removeAFromFirst2Charecters.removeA("BAETSJFYFJJD"));
	}
	@Test
	void testSJTETSJFYFJJD() {
		assertEquals("SJTETSJFYFJJD", removeAFromFirst2Charecters.removeA("SJTETSJFYFJJD"));
	}
}
