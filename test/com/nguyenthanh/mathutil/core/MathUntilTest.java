
package com.nguyenthanh.mathutil.core;

import junit.framework.Assert;
import org.junit.Test;

public class MathUntilTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        //Test case #3: đưa data cà chớn, n âm, n quá lớn
        //              hàm được thiết kế ném về ngoại lệ!!!
        //Thấy ngoại lệ mừng rơi nước mắt khi đưa vào -5
        //thấy ngoại xuất hiện như kì vọng => pass cái test => màu xanh
        System.out.println("Hope to see the Exception| Illegal Exception");
        MathUtil.getFactorial(-5);
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {
        
        //Test case #4: n = 3, hy vọng hàm trả về 6
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        //Test case #5: n = 3, hy vọng hàm trả về 24
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        
        //Test case #6: n = 5, hy vọng hàm trả về 120
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }
    
    @Test //coding convention - quy tắc viết code
          //tên hàm kiểm thử/tên hàm của test script
          //phải nói lên ts nghĩa của việc kiểm thử 
          //tình huống này, ta mún test hàm getF() tham số tử tế
          //n = 0..20!!! 
    public void testFactorialGivenRightArgumentReturnsWell() {
        
        //Test case #1: n = 0, hy vọng hàm trả về 1
        //                     thực tế hàm trả về mấy, ai biết!!!
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, actual);
        
        //Test case #2: n = 1, hy vọng hàm trả về 1
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        
        //Test case #3: n = 2, hy vọng hàm trả về 2
        Assert.assertEquals(2, MathUtil.getFactorial(2));
    }
    
    
    
    //@Test ra lệnh cho thư viện JUnit minhf đã import
    //tự động generate ra các hàm public static void main()
    //biến hàm tryJUnitComparison() thành hàm main()
    //và gửi main() này cho JVM chạy - Java Virtul machine
    //@Test ~ main()
    //ko có @Test thì class ko có main, lấy gif mà chạy no runable method
    @Test
    public void tryJUnitComparison() {
        //hàm này thử nghiệm việc so sánh Expected vs Actual
        //coi đúng sai ra màu thế nào
        //ta đang xài hàm của thử viện JUnit nhưng ko xài bừa bãi
        //mà phải viết theo đúng quy tắc định trước
        //quy tắc nằm ở @ - anotation
        
        Assert.assertEquals(200, 200);
    }
}


//CLASS NÀY DEV SẼ VIẾT NHỮNG CÂU LỆNH DÙNG ĐỂ TEST HÀM
//CỦA CODE CHÍNH, TEST CÁC HÀM CỦA CLASS MATHUTIL
//Trong class sẽ có những lời gọi hàm getFactorial()
//có những lệnh so sánh giữa Expected và Actual
//giống mình đã test bên Main()
//nhưng khác ở chỗ, SAI => màu đỏ, ĐÚNG => màu xanh
//mắt ko cần nhìn các dòng output từ hàm sout cho mất sức
//mắt giờ chỉ cần nhìn màu xanh hay màu đỏ thôi
//Muốn có được điều này ta sẽ dùng thêm các UNIT TESTING FRAMEWORK
//Ví dụ: JUnit, TestNG (Java)
//       xUnit, MSTest, NUnit (C#)
//       PHUnit (PHP)

//VIỆC VIẾT CODE ĐỂ TEST CODE GỌI LÀ UNIT TESTING
//ĐOẠN CODE TRONG CLASS NÀY DÙNG JUNIT/UNIT TESTING FRAMEWORK
//ĐỂ KIỂM THỬ HÀM CẢU CODE CHÍNH
//ĐOẠN CODE KIỂM THỬ NÀY ĐƯỢC GỌI LÀ: TEST SCRIPT
//CODE dùng để test code (chính) gọi là test script
//Test script là các đoạn code được viết ra để test các đoạn code chính (DA0, DTO, Controller,...)
//Muốn Test thì phải cần phát thảo Test Case
//Test Script sẽ sử dụng Test Case
//Ví dụ: viết code để test hàm getFactorial() với các case
//n = -5, 0, 1,...
