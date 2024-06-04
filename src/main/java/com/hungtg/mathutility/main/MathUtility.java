/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hungtg.mathutility.main;

import com.hungtg.mathutility.core.MathUtiliyV1;
import javax.swing.JOptionPane;


public class MathUtility {
    //pswm tab tạo nhanh hàm main
    public static void main(String[] args) {
        //Cách 2: test hàm bằng cách POP UP
        int n = 0;
        long expectedValue = 1;
        long actualValue; //= ?;
        actualValue = MathUtiliyV1.getFactorial(n);
        String result = n + "! | EX: " + expectedValue + " | AC: " + actualValue;
        JOptionPane.showMessageDialog(null, result);
        //System.out.println("0! | EXPECTED: " + expectedValue + " | " + "ACTUAL: " + actualValue );
    }
    
//     public static void main(String[] args) {
//        //TEST CASE #1: N = 0, EX VALUE = 1, AC VALUE = ?, STATUS = ?
//        int n = 0;
//        long expectedValue = 1;
//        long actualValue; //= ?;
//        actualValue = MathUtiliyV1.getFactorial(n);
//        System.out.println("0! | EXPECTED: " + expectedValue + " | " + "ACTUAL: " + actualValue );
//         
//        
//        //TEST CASE #2: N = 1, EX VALUE = 1, AC VALUE = ?, STATUS = ?
//        n = 1;
//        expectedValue = 1;
//        actualValue = MathUtiliyV1.getFactorial(n);
//        System.out.println("1! | EXPECTED: " + expectedValue + " | " + "ACTUAL: " + actualValue );
//        
//        
//        //TEST CASE #3: N = 5, EX VALUE = 1, AC VALUE = ?, STATUS = ?
//        n = 5;
//        expectedValue = 120;
//        actualValue = MathUtiliyV1.getFactorial(n);
//        System.out.println("5! | EXPECTED: " + expectedValue + " | " + "ACTUAL: " + actualValue );
//        
//        //TEST CASE #4: N = -1, EX VALUE = NGOẠI LỆ, AC VALUE = ?, STATUS = ?
//        System.out.println("Check if the illegal Exception is thrown: ");
//        n = -1;
//        //expectedValue = 120;
//        actualValue = MathUtiliyV1.getFactorial(n);
//        System.out.println("5! | EXPECTED: " + expectedValue + " | " + "ACTUAL: " + actualValue );
//    }
}
