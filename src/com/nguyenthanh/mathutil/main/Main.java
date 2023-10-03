/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.nguyenthanh.mathutil.main;

import com.nguyenthanh.mathutil.core.MathUtil;

/**
 *
 * @author Nguyen Thanh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("More over, this message comes from a US-BUILT'S JAR FILE");
        tryTDDFirst();
        testFactorialGivenWrongArgumentThrowsException();
    }
    
    public static void testFactorialGivenWrongArgumentThrowsException() {
        //Test case #3: đưa data cà chớn, n âm, n quá lớn
        //              hàm được thiết kế ném về ngoại lệ!!!
        //Thấy ngoại lệ mừng rơi nước mắt khi đưa vào -5
        //thấy ngoại xuất hiện như kì vọng => pass cái test => màu xanh
        System.out.println("Hope to see the Exception| Illegal Exception");
        MathUtil.getFactorial(-5);
    }
    
    //hàm này được viết ra để dùng thử kỹ thuật viết code kiểu TDD
    //gọi thử/dùng hàm chính bên core/bên MathUtil
    //xem nó đúng sai ra sao, ở ngay mức khởi đầu viết hàm
    public static void tryTDDFirst() {
        
        //Test case #1
        //- Input: n = 1;
        //- Gọi hàm getFactorial(1);
        //- Hy vọng hàm trả về 1, vì 1! = 1
        long expected = 1;
        long actual = MathUtil.getFactorial(1);
        //so sánh expected vs actual coi chúng giống nhau không?
        //giống -> hàm đúng với case đang test
        //sai -> bug rồi!!! với case đang test
        System.out.println("Test 1! | Status: " + "Expected: " + expected + " | Actual: " + actual);
        
        //Test case #2
        //- Input: n = 2;
        //- Gọi hàm getFactorial(2);
        //- Hy vọng hàm trả về 2, vì 2! = 2
        
        System.out.println("Test 2! | Status: " + "Expected: 2" + " | Actual: " + MathUtil.getFactorial(3));
    }
    
}
