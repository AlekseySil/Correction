public class Book {
    private String titlee;
    private int year;
    private Author author;

    public Book (Author author, String title, int year){
        this.author = author;
        this.titlee = title;
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return titlee;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
