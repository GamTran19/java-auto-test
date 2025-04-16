package com.cmcglobal.Exercise.Baitap4;

public class Library {
    private Book[] books;
    private int bookCount; // số lượng sách có trong thư viện

    // Constructor khởi tạo thư viện với số lượng sách tối đa là 100
    public Library() {
        this.books = new Book[100];
        this.bookCount = 0;
    }


    // Thêm sách vào thư viện
    public void addBook(Book book) {

        // Nếu số lượng sách có trong thư viện < số sách tối đa => Được phép thêm sách mới vào
        if (bookCount < books.length) {
            books[bookCount] = book; // Thêm sách vào vị trí cuối cùng
            bookCount++;
            System.out.println("Sách đã được thêm vào thư viện: " + book.getTitle());
        } else {
            System.out.println("Thư viện đã đầy, không thể thêm sách mới!");
        }
    }

    // Xóa sách theo ISBN
    public void removeBook(String isbn) {

        // Kiểm tra từng cuốn sách
        for (int i = 0; i < bookCount; i++) {
            // Nếu cuốn sách nào có ISBN cần tìm
            if (books[i].getIsbn().equals(isbn)) {
                books[i] = books[bookCount - 1]; // Di chuyển sách cuối cùng lên vị trí bị xóa
                books[bookCount - 1] = null; // Chỗ sách vừa di chuyển lên thì ta để = null
                bookCount--; // Trừ số lượng sách đi 1
                System.out.println("Đã xóa sách: " + books[i].getTitle());
                return;
            }
        }
        System.out.println("Không tìm thấy sách có ISBN: " + isbn);
    }

    // Tìm kiếm sách theo tiêu đề hoặc tác giả
    public void searchBook(String keyword) {
        System.out.println("Kết quả tìm kiếm cho từ khóa: " + keyword);
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(keyword) || books[i].getAuthor().equalsIgnoreCase(keyword)) {
                books[i].displayBookDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sách!");
        }
    }

    // Hiển thị tất cả sách trong thư viện
    public void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("Thư viện không có sách nào.");
            return;
        }
        System.out.println("Danh sách tất cả sách trong thư viện:");
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBookDetails();
        }
    }

    // Mượn sách theo ISBN
    public void borrowBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                books[i].borrowBook();
                return;
            }
        }
        System.out.println("Không tìm thấy sách có ISBN: " + isbn);
    }

    // Trả sách theo ISBN
    public void returnBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                books[i].returnBook();
                return;
            }
        }
        System.out.println("Không tìm thấy sách có ISBN: " + isbn);
    }
}
