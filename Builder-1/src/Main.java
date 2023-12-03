public class Main {
    public static void main(String[] args) {
        Book book1 = new Book.BookBuilder(1L, "isbn1234").author("hj").build();
        Book book2 = new Book.BookBuilder(2L, "ifbb pro").title("제목").pages(250).build();

    }
}