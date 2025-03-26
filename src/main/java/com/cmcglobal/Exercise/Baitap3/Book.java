package com.cmcglobal.Exercise.Baitap3;

public class Book {
    // Phạm vi truy cập private chỉ truy cập được trong class
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    // Constructor khởi tạo sách
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true; // Mặc định sách có sẵn khi thêm mới
    }

    //Các phương thức getter để lấy giá trị title, author, isbn, và isAvailable (public).
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Method kiểm tra xem còn sách có sẵn hay không
    public boolean isAvailable() {
        return isAvailable;
    }


    // Method hiển thị thông tin chi tiết của sách
    public void displayBookDetails() {
        System.out.println("Tiêu đề: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Trạng thái: " + (isAvailable ? "Có sẵn" : "Đã mượn"));
        System.out.println("-----------------------");
    }



    // Mượn sách
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Bạn đã mượn sách: " + title);
        } else {
            System.out.println("Sách này đã được mượn!");
        }
    }

    // Trả sách
    public void returnBook() {
        isAvailable = true;
        System.out.println("Bạn đã trả sách: " + title);
    }

}
