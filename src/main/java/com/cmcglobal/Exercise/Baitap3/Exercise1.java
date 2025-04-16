package com.cmcglobal.Exercise.Baitap3;
import java.util.Scanner;
public class Exercise1 {

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        // Exercise:  Library Management System with Access Modifiers
        // Tạo thư viện
        Library library = new Library();


        // Thêm sách vào thư viện
        library.addBook(new Book("Tây Du Kí", "Ngô Thừa Ân", "123"));
        library.addBook(new Book("One Piece", "Eiichiro Oda", "456"));
        library.addBook(new Book("Naruto", "Masashi Kishimoto", "789"));

        // Hiển thị danh sách sách
        System.out.println("\n");
        library.displayAllBooks();

        // Mượn sách
        System.out.println("\n--- Mượn sách ---");
        library.borrowBook("123");
        library.borrowBook("123"); // Thử mượn lại sách đã mượn


        // Hiển thị danh sách sách
        System.out.println("\n");
        library.displayAllBooks();

        // Trả sách
        System.out.println("\n--- Trả sách ---");
        library.returnBook("123");

        // Hiển thị danh sách sách
        System.out.println("\n");
        library.displayAllBooks();

        // Tìm kiếm sách
        System.out.println("\n--- Tìm kiếm sách ---");
        library.searchBook("One Piece");

        // Tìm kiếm theo tên tác giả
        System.out.println("\n");
        library.searchBook("Ngô Thừa Ân");

        // Xóa sách
        System.out.println("\n--- Xóa sách ---");
        library.removeBook("456");

        // Hiển thị danh sách sau khi xóa
        System.out.println("\n--- Danh sách sau khi xóa sách ---");
        library.displayAllBooks();

//        // Mượn sách
//        System.out.print("\nNhập ISBN sách muốn mượn: ");
//        String borrowIsbn = scanner.nextLine();
//        library.borrowBook(borrowIsbn);
//
//        // Trả sách
//        System.out.print("\nNhập ISBN sách muốn trả: ");
//        String returnIsbn = scanner.nextLine();
//        library.returnBook(returnIsbn);
//
//        // Tìm sách
//        System.out.print("\nNhập tiêu đề hoặc tác giả cần tìm: ");
//        String keyword = scanner.nextLine();
//        library.searchBook(keyword);
//
//        // Hiển thị lại toàn bộ sách
//        System.out.println();
//        library.displayAllBooks();

    }
}
