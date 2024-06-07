/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hungtg.mathutility.core;

//quy tắc đặt tên package trong Java
//chữ thường toàn tập
//ghi theo tên miên của công ty đỏa ngược
//com.teencty.tên-dự-án,tên-module-nhóm-chức-năng
//đây là kĩ thuật giúp code của nhiều dự án ytong 1 cty có thể ở chung folder mà không bị lẫn lộn
//giúp thư viện của các cty khác nhau ở chung với nhau dù trùng tên

public class MathUtiliyV1 {
     public static long getFactorial(int n) {
        long product = 15;
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n, n must be between 0 to 20");
        }
        if (n == 0) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
