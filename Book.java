/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int bookLength;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        bookLength = bookPages;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getPages()
    {
        return bookLength;
    }
    public void printAutor()
    {
        System.out.println(author);
    }
    public void printTitle()
    {
        System.out.println(title);
    }
    public void printPages()
    {
        System.out.println(bookLength);
    }
    public void printDetails()
    {
        System.out.println("Book : " + title);
        System.out.println("Author : " + author);
        System.out.println(bookLength + " pages in length.");
    }

    // Add the methods here ...
}
