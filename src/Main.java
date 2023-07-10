// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Library_Item
{
    private int BookId;
    String Title;
    int Year;

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public int getBookId() {
        return BookId;
    }
}
class Book extends Library_Item
{
    private String Author;
    public void setAuthor(String author) {
        Author = author;
    }
    public String getAuthor() {
        return Author;
    }
    public void printBook()
    {
        System.out.println("Book Name is : "+Title+"\n"+"Book Id is : "+getBookId()+"\n"+"Published in : "+Year+"\n"+"Author is : "+Author);
    }
}
class Magazine extends Library_Item
{
    private int Issue;
    public void setIssue(int issue) {
        Issue = issue;
    }
    public int getIssue() {
        return Issue;
    }
    public void printMagazine()
    {
        System.out.println("Book Name is : "+Title+"\n"+"Book Id is : "+getBookId()+"\n"+"Published in : "+Year+"\n"+"Issue is : "+Issue);
    }
}
public class Main{
    public static void main(String[] args) {
        Book book=new Book();
        Magazine magazine=new Magazine();


        magazine.Title="The Hindu";
        magazine.Year=2023;
        magazine.setIssue(150);
        magazine.setBookId(56);
        magazine.printMagazine();

        book.Title="Thor";
        book.Year=1995;
        book.setBookId(1);
        book.setAuthor("Stan Lee");
        book.printBook();
    }
}