package generics.ex2.model;

import java.time.LocalDate;

public class Book implements Media {
    private String title;
    private double price;
    private LocalDate releaseDate;
    private String isbn;

    public Book(String title, double price, LocalDate releaseDate, String isbn) {
        this.title = title;
        this.price = price;
        this.releaseDate = releaseDate;
        this.isbn = isbn;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
