package com.cmcglobal.lesson4;

public class ForLoop {
    public static void main(String[] args) {

 /*
   Bài 1: Cho danh sách
   String[] name_List = {"Alice","Bob","Charlie", "Diana", "Elsa"};
   In ra từng tên người trong danh sách
  */

//        String[] name_List = {"Alice","Bob","Charlie", "Diana", "Elsa"};
//        for (String name: name_List){
//            System.out.println(name);
//        }


 /*
  bài 2: In ra các số từ 1 đến 10 trên từng dòng
  */
//for (int i = 1; i <= 10; i++ ){
//    System.out.println(i);
//}

 /*
   Bài 3: Cho danh sách
   String[] name_List = {"Alice","Bob","Charlie", "Diana", "Elsa"};
   In ra số thứ tự và tên từng người trong danh sách
  */

//         String[] name_List = {"Alice","Bob","Charlie", "Diana", "Elsa"};
//        // cách 1
//        int id = 1;
//        for (String name: name_List){
//            System.out.println(id + ":" + name);
//            id ++;
//        }
        // cách 2:
//        for (int id = 0; id < name_List.length; id++){
//            System.out.println(id + ":" + name_List[id]);
//        }

   /*
   Bài 4: in ra các số  trong khoảng từ 1 ~ 30 mà không chia hết cho 2 và không chia hết cho 3
  */
       for (int i = 1; i <= 31; i++){
           if(i % 2 != 0 && i % 3 != 0){
               System.out.println(i);
           }
       }

    }
}
