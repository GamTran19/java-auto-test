package com.cmcglobal.lesson4;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] arg) {

        /*
          Bài 1: Nguười dùng nhập các số tự nhiên trong khảong 1 ~ 5 tương ứng với cấp bậc người dùng.
          Biết bậc cao hơn sẽ có tất  cả quyền lợi của bậc thấp hơn m quyền lợi thêm của bậc tương ứng.
          In ra quyền lợi của cấp bậc người dùng
          Bậc 1: kim cương
             + Miễn phí sử dụng phòng tổng thống tại khách sạn khu resort
          Bậc 2: vàng
             + Miễn phí ăn uống tại các nhà hàng khu resort
          Bậc 3: Bạc
             + Giảm 20% phí mua sắm tại tất cả các cửa hàng khu resort
          Bậc 4: Đồng
             + Miễn phí gửi xe trong khu resort
          Bậc 5: Khách hàng thân thiết
             + Tích lũy điểm để đôỉ voucher khi sử dụng dih vụ của khu resort

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập hạng cần tra cứu: ");
        int rank = sc.nextInt();
//switch (rank){
//    case 1:
//        System.out.println("Miễn phí sử dụng phòng tổng thống tại khách sạn khu resort");
//    case 2:
//        System.out.println("Miễn phí ăn uống tại các nhà hàng khu resort");
//    case 3:
//        System.out.println("Giảm 20% phí mua sắm tại tất cả các cửa hàng khu resort");
//    case 4:
//        System.out.println("Miễn phí sử dụng phòng tổng thống tại khách sạn khu resort");
//    case 5:
//        System.out.println("Tích lũy điểm để đôỉ voucher khi sử dụng dih vụ của khu resort");
//}

/*
Bài 2: Tương tự bài 1 nhưng thêm điều kiện
+ In thêm tên cấp bậc của người dùng  trước danh sách quyền lợi
+ Nếu là người dùng bậc 1 hoặc 2: Giảm 50% phí tham gia tại tất cả khu vui chơi của resort
+ Nếu là người dùng bậc 3 hoặc 4: Giảm 20% phí tham gia tại tất cả khu vui chơi của resort
 */
// cách 1
//        if (rank == 1 || rank == 2) {
//            System.out.println("Giảm 50% phí tham gia tại tất cả khu vui chơi của resort");
//        } else if (rank == 3 || rank == 4) {
//            System.out.println("Giảm 20% phí tham gia tại tất cả khu vui chơi của resort");
//        }
//        switch (rank) {
//            case 1:
//                System.out.println("Miễn phí sử dụng phòng tổng thống tại khách sạn khu resort");
//            case 2:
//                System.out.println("Miễn phí ăn uống tại các nhà hàng khu resort");
//            case 3:
//                System.out.println("Giảm 20% phí mua sắm tại tất cả các cửa hàng khu resort");
//            case 4:
//                System.out.println("Miễn phí sử dụng phòng tổng thống tại khách sạn khu resort");
//            case 5:
//                System.out.println("Tích lũy điểm để đôỉ voucher khi sử dụng dih vụ của khu resort");
//        }
        // cách 2
//        boolean discount = false;
//        switch (rank) {
//            case 1:
//            case 2:
//                System.out.println("Giảm 50% phí tham gia tại tất cả khu vui chơi của resort");
//                discount = true;
//                switch (rank) {
//                    case 1:
//                        System.out.println("Miễn phí sử dụng phòng tổng thống tại khách sạn khu resort");
//                    case 2:
//                        System.out.println("Miễn phí ăn uống tại các nhà hàng khu resort");
//                }
//            case 3:
//            case 4:
////        discount  == true => Viết tắt là (discount)
////          discount == false => Viết tắt là (!discount)
//                if (!discount) {
//                    System.out.println("Giảm 20% phí tham gia tại tất cả khu vui chơi của resort");
//                }
//                switch (rank) {
//                    case 1:
//                    case 2:
//                    case 3:
//                        System.out.println("Giảm 20% phí mua sắm tại tất cả các cửa hàng khu resort");
//                    case 4:
//                        System.out.println("Miễn phí sử dụng phòng tổng thống tại khách sạn khu resort");
//                }
//            default:
//                System.out.println("Tích lũy điểm để đôỉ voucher khi sử dụng dih vụ của khu resort");
//        }

        // Cách 3

        switch (rank) {
            case 1:
            case 2:
                System.out.println("Giảm 50% phí tham gia tại tất cả khu vui chơi của resort");
            case 3:
            case 4:
                System.out.println("Giảm 20% phí tham gia tại tất cả khu vui chơi của resort");

        }
        switch (rank) {
            case 1:
                System.out.println("Miễn phí sử dụng phòng tổng thống tại khách sạn khu resort");
            case 2:
                System.out.println("Miễn phí ăn uống tại các nhà hàng khu resort");
            case 3:
                System.out.println("Giảm 20% phí mua sắm tại tất cả các cửa hàng khu resort");
            case 4:
                System.out.println("Miễn phí sử dụng phòng tổng thống tại khách sạn khu resort");
            case 5:
                System.out.println("Tích lũy điểm để đôỉ voucher khi sử dụng dih vụ của khu resort");
        }
    }
}
