package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// @DisplayNameGeneration(DisplayNameGenerator.Simple.class)
// Test class don't necessarily need to be public
@TestMethodOrder(MethodOrderer.DisplayName.class)
class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
    }

    @Test
    @DisplayName("Equal and Not Equal")

    void testEqualsAndNotEquals() {
        assertEquals(6, demoUtils.add(2,4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1,9), "1+9 must not be 6");
    }

    @Test
    @DisplayName("Null and Not Null")
    void testNullorNotNull() {
        String str1 = null;
        String str2 = "luv2code";
        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2),"Object should not be null");
    }

    @DisplayName("Same and Not Same")
    @Test
    void testSameAndNotSame() {
        String str = "luv2code";
        assertSame(demoUtils.getAcademy(),demoUtils.getAcademyDuplicate(),"Objects should " +
                "refer to same object");
        assertNotSame(str,demoUtils.getAcademy(),"Objects should not refer to same object");
    }

    @DisplayName("True and False")
    @Test
    void testTrueFalse() {
        int gradeOne = 10;
        int gradeTwo = 5;
        assertTrue(demoUtils.isGreater(gradeOne,gradeTwo),"This should return true");
        assertFalse(demoUtils.isGreater(gradeTwo,gradeOne),"This should return false");
    }

    @DisplayName("Array Equals")
    @Test
    void testArrayEquals() {
        String[] stringArray = {"A","B","C"};
        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet());
    }

    @DisplayName("Iterable equals")
    @Test
    void testIterableEquals() {
        List<String> theList = List.of("luv","2","code");
        assertIterableEquals(theList, demoUtils.getAcademyInList());
    }

    @DisplayName("Lines match")
    @Test
    void testLineMatch() {
        List<String> theList = List.of("luv","2","code");
        assertLinesMatch(theList,demoUtils.getAcademyInList());
    }

    @DisplayName("Throws and Does Not Throw")
    @Test
    void testThrowAndDoesNotThrow() {
        assertThrows(Exception.class, ()->{demoUtils.throwException(-1);});
        assertDoesNotThrow(()->{demoUtils.throwException(5);});
    }

    @DisplayName("Multiply")
    @Test
    void testMultiply() {
        assertEquals(12,demoUtils.multiply(6,2));
    }

    /*
    @AfterEach
    void tearDownAfterEach() {
        System.out.println("Running @AfterEach");
        System.out.println();
    }

    @BeforeAll
    static void setupBeforeEachClass() {
        System.out.println("@BeforeAll executes only once before all test methods");
    }

    @AfterAll
    static void tearDownAfterAll() {
        System.out.println("@AfterAll executes only once after all test methods execution in class");
    }
     */
}
