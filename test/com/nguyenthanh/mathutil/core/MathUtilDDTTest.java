/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.nguyenthanh.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.nguyenthanh.mathutil.core.MathUtil.getFactorial;

/**
 *
 * @author Nguyen Thanh
 */

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //chuẩn bị data, mảng 2 chiều vì nó có n đưa vào và expected [2]
    //và có nhiều cặp như thế [7]
    //mảng 2 chiều [7][2]
    
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20, 25};
        int b[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};
        int c[][] = {{1, 0}, 
                     {1, 1}, 
                     {2, 2}, 
                     {6, 3}, 
                     {24, 4}, 
                     {120, 5}, 
                     {720, 6}
                    };
        
        return new Integer[][]{{1, 0}, 
                               {1, 1}, 
                               {2, 2}, 
                               {6, 3}, 
                               {24, 4}, 
                               {120, 5}, 
                               {720, 6}
                                };
    }//xài wrapper class nếu chơi với số, ví dụ Integer (int) Long (long)
    
    //sau khi có bộ data qua mảng 2 chiều , JUNIT sẽ tự động lặp for
    //để lôi ra từng cặp data (1, 0) (1, 1) (2, 2) (6, 3)...
    //nhồi cặp này vào trong hàm so sánh
    //nhưng nhồi bằng cách nào, gán value vào biến nào đó
    //gán vào biến - THAM SỐ HÓA Parameters
    //Ta sẽ map/ánh xạ 2 cột ứng với 2 biến: cột 0 - EXPECTED
    //                                       cột 1 - N đưa vào hàm getF()
    
    @Parameterized.Parameter(value = 0)
    public long expected;
    
    @Parameterized.Parameter(value = 1)
    public int n;
    
    @Test
    public void testFactorialGivenRightArgumentReturnWell() {
        assertEquals(expected, getFactorial(n));
    }
    
}

//CLASS NÀY CHỨA CODE DÙNG ĐỂ TEST CODE CHÍNH Ở BÊN CLASS MATHUTIL
//CLASS NÀY CHỨA CODE DÙNG ĐỂ HÀM getF() coi hàm chạy đúng ko
//Code viết ra dùng để test code khác
//thì code này được gọi là TEST SCRIPT
//1 TEST SCRIPT chứa nhiều test case, mỗi test case ứng với 1 tình huống sài hàm

//- PARAMETERIZED - THAM SỐ HÓA, BIẾN DATA RA MỘT CHỖ, ĐẶT CHO CHÚNG 1 CÁI TÊN BIẾN,
//LÁT HỒI NHỒI CHÚNG TRỞ LẠI LỆNH SO SÁNH

//- DDT - DATA DRIVEN TESTING VIẾT CODE KIỂM THỬ THEO STYLE TÁCH DATA
//JUNIT FW HỖ TRỢ SẴN CHO TA VỤ TÁCH DATA, DUYỆT VÒNG FOR TRÊN DATA
//NHỒI VÀO HÀM TƯƠNG ỨNG

//ĐỂ CHƠI VỚI DDT, TA CẦN 
//- Tách data ra 1 chỗ - mảng
//- Map cái data này vào các biến tương ứng 
//- Nhồi các biến tương ứng này vào câu lệnh so sánh/gọi hàm 
