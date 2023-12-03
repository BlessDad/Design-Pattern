public class Book {
    private Long id; // 필수
    private String isbn; // 필수

    private String title;
    private String author;
    private int pages;
    private String category;



    public static class BookBuilder {
        private Long id; // 필수
        private String isbn; // 필수

        private String title;
        private String author;
        private int pages;
        private String category;

        public BookBuilder(Long id, String isbn) {
            this.id = id;
            this.isbn = isbn;
        }


        public BookBuilder title(String t){
            this.title = t;
            return this;
        }

        public BookBuilder author(String a){
            this.author = a;
            return this;
        }

        public BookBuilder pages(int p){
            this.pages = p;
            return this;
        }

        public BookBuilder category(String c){
            this.category = c;
            return this;
        }

        public Book build(){
            Book book = new Book();
            book.id = this.id;
            book.isbn = this.isbn;
            book.title = this.title;
            book.author = this.author;
            book.category = this.category;
            book.pages = this.pages;
            return book;
        };



    }
}
