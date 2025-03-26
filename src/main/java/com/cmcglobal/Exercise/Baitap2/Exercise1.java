package com.cmcglobal.Exercise.Baitap2;

public class Exercise1 {
    public static void main(String[] arg) {
        //cách 1
//        for (int i = 1; i <= 100; i++){
//
//            switch (1) { // truyền số 1 để vòng lặp for luôn check case 1 trước
//                case 1    :
//                    if (i % 3 == 0 && i % 5 == 0) {
//                        System.out.println("FizzBuzz");
//                        break;
//                    }
//                    // nếu không chia hết cho 3 và 5 thì sẽ chạy tiếp case 2
//                case 2:
//                    if (i % 3 == 0) {
//                        System.out.println("Fizz");
//                        break;
//                    }
//                    // tương tự nếu không chia hết cho 3 thì sẽ chạy tiếp case 3
//                case 3:
//                    if (i % 5 == 0) {
//                        System.out.println("Buzz");
//                        break;
//                    }
//                default: //mặc định nếu không úng các TH trên thì in ra default là i
//                    System.out.println(i);
//                    break;
//            }
//
//            // Nếu không phải bội số của 3 hoặc 5, in chính số đó
//        }

        // cách 2
      for (int i = 1; i <= 100; i++){
          String ouput = "";
          if (i % 3 == 0) {
              ouput += "Fizz"; // ouput = ouput + "Fizz"
          }
          if (i % 5 == 0) {
              ouput += "Buzz";
          }
          switch (ouput){
              case "Fizz":
                  System.out.println("Fizz");
                  break;
              case "Buzz":
                  System.out.println("Buzz");
                  break;
              case "FizzBuzz":
                  System.out.println("FizzBuzz");
                  break;
              default:
                  System.out.println(i);
          }
      }

    }
}