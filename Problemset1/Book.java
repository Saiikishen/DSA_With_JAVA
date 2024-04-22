public class Book {
    String Title;
    String author;
    String publisher;
    int bookid;
    int ISBN;

    public Book(String Title, String author,String publisher,int bookid,int ISBN){
        this.Title = Title;
        this.author = author;
        this.publisher=publisher;
        this.bookid=bookid;
        this.ISBN=ISBN;
    }

    public  void display(){
        System.out.println(Title);
        System.out.println(author);
        System.out.println(publisher);
        System.out.println(bookid);
        System.out.println(ISBN);

    }
    public static void main(String[] args) {
        Book book1 = new Book("hi", "hello", "pearson", 123, 321);
        book1.display();
    }
    
}
