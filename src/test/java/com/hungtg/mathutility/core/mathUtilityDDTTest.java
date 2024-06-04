/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hungtg.mathutility.core;

import com.hungtg.mathutility.core.MathUtiliyV1;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Admin
 */
public class mathUtilityDDTTest {
    
    //CHUẨN BỊ BỘ DATA ĐƯA VÀO HÀM GETFAC()
    //0! -> 1 | 1! -> 1; | 2! -> 2 | 3! -> 6
    //{0,1}, {1,1}, {2,2}, {3,6}, {4,24}, {5,120}
    
    public static Object[][] initData(){
        return new Object[][]{
            {0,1}, 
            {1,1}, 
            {2,2}, 
            {3,6}, 
            {4,24}, 
            {5,120},
            {6,720}
        };
    }
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactoryVenRightArgument1(int n, long expected){
        assertEquals(expected, MathUtiliyV1.getFactorial(n));
    }
}
