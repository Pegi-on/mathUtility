/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hungtg.mathutility.core;

//quy tắc đặt tên đảo ngược, đi kèm với thông tin dự án, project và mod

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
//chứa các test case dùng để test coe, cãi dề dùng
public class MathUtilityTest {
    
    //Testcase: là bộ data đầu vào  + thao tác nhập xuất trên app, màn hình, trên hàm
    
    //Test Case #1: 
    //Input/Given n = 0;
    //Step(bước test)
    //call method getFractorial(n)
    //EX: 1
    //AC: ??
    //Status: passed/failed

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. 
    @Test //frameworld: ép ta phải viết code theo 1 quy tắc nào đó
            //thư viện 
    public void testFactorialGivenArg0ReturnWell(){
        assertEquals(1, MathUtiliyV1.getFactorial(0));
    }
    
    //Test Case #2: Check 
    //Input/Given n = 1;
    //Step(bước test)
    //call method getFractorial(n)
    //EX: 1
    //AC: ??
    //Status: passed/failed
    @Test //frameworld: ép ta phải viết code theo 1 quy tắc nào đó
    public void testFactorialGivenArg1ReturnWell(){
        assertEquals(1, MathUtiliyV1.getFactorial(1));
    }
    
    //Test Case #3: Check getF() with n = 5
    //Input/Given n = 5;
    //Step(bước test)
    //call method getFractorial(n)
    //EX: 120
    //AC: ??
    //Status: passed/failed
    @Test //frameworld: ép ta phải viết code theo 1 quy tắc nào đó
    public void testFactorialGivenArg5ReturnWell(){
        assertEquals(120, MathUtiliyV1.getFactorial(5));
    }
    
    @Test //frameworld: ép ta phải viết code theo 1 quy tắc nào đó
    public void testFactorialGivenArg12345ReturnWell(){
        assertEquals(1, MathUtiliyV1.getFactorial(1));
        assertEquals(2, MathUtiliyV1.getFactorial(2));
        assertEquals(6, MathUtiliyV1.getFactorial(3));
        assertEquals(24, MathUtiliyV1.getFactorial(4));
        assertEquals(120, MathUtiliyV1.getFactorial(5));
    }
    
    //thấy ngoại lệ phải mừng rơi nước mắt
    //test case #5: check getF() với n = -1, the method throw exception
    @Test
    public void testFactorialGivenWrongThrowException(){
        //ngoại lệ
        //MathUtiliyV1.getFactorial(-1);
        assertThrows(IllegalArgumentException.class, () -> {MathUtiliyV1.getFactorial(-1);});
    }
    

}
