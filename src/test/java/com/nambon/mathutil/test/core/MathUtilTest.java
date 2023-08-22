/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nambon.mathutil.test.core;

import com.nambon.mathutil.core.MathUtil;
//danh rieng  cho nhung ham static
import static com.nambon.mathutil.core.MathUtil.getFactorial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Admin
 */
public class MathUtilTest {
    
    //generate data
    public static Object[][] initData() {
        Object[][] data = new Integer[][] {
            {1,1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120}
        };
        return data;
    }
    
    
    
    @ParameterizedTest
    @MethodSource(value = "initData") // ten ham cung cap data
                                     // ngam dinh thu tu cua mang
                                     // va map vao tham so 
    public void testGetFactorialGivenRightArgReturnWell(int input, int expected) {
        assertEquals(expected, getFactorial(input));
    }
    
    @Test
    public void testGetFactorialGivenWrongArgThrowException() {
        Executable execute = () -> {getFactorial(-5);};
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(-5);});
    }
    
}
