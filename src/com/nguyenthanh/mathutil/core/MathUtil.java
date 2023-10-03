/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nguyenthanh.mathutil.core;

/**
 *
 * @author Nguyen Thanh
 */
//đây là class mô phỏng lại các hàm tiện ích/dùng chung cho mọi class khác, mô phỏng lại class tiện ích java.Math của JDK
//Phàm cáci gì là đồ dùng chung, thường được thiết kế là static
public class MathUtil {

    public static final double PI = 3.1415;

    //hàm tiện ích tính n! = 1.2.3...n
    //Lưu ý/quy ước:
    //- Không tính giai thừa số âm!!!
    //0! = 1! = 1
    //vì giai thừa tăng cực nhanh, nên 21! đã vượt quá 18 số 0 tràn của long
    //ta không tính 21! trở lên
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        //sống sots đến đây, sure n = 2...20!!!
        //cấm ko sài else nữa khi hàm có return phía trước
        long product = 1; //biến cộng dồn, nhân dồn, biến con heo đất
        //acc/accumlation/gửi góp 
        for (int i = 2; i <= n; i++) {
            product *= i;
        }

        return product;
    }

    //TA SẼ HỌC SƠ VỀ TDD - TEST DRIVEN DEV
    //LÀ KỸ THUẬT LẬP TRÌNH/ÁP DỤNG CHO DÂN DEV ĐỂ GIA TĂNG
    //CHẤT LƯỢNG CODE/GIẢM THIỂU CÔNG SỨC TÌM BUG/PHÁT HIỆN BUG SỚM
    //TDD YÊU CẦU DEV KHI VIẾT CODE/VIẾT CLASS/HÀM PHẢI VIẾT LUN
    //các bộ kiểm thử/viết luôn các test case/viết luôn các đoạn code dùng thử
    //hàm để kiểm tra tính đúng đăn cảu hàm/class
    //ngắn gọn: viết code kiềm với test cases
    //viết code có ý thức viết lun phần kiểm thử code/hàm/class (ý thức = driven)
    //SAU KHI CÓ ĐƯỢC TÊN HÀM (CHỈ TÊN HÀM MÀ THÔI) 
    //TA VIẾT LUÔN CÁC TÌNH HUỐNG SÀI HÀM
    //CHẤP NHẬN KHI CHẠY CHẠY SAI - DO CODE CHƯA HOÀN THÀNH
    //SAU ĐÓ TỐI ƯU/CHỈNH SỬA CODE ĐỂ ĐẢM BẢO CODE CHẠY ĐÚNG!!!
    //QUÁ TRÌNH SAI - ĐÚNG - SAI - ĐÚNG DIỄN RA LIÊN TỤC (cycle)
    //có thể add thêm phần TDD vào CV xin việc
}
