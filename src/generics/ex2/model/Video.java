package generics.ex2.model;

import java.time.LocalDate;

public class Video implements Media {
    private String title;
    private double price;
    private LocalDate releaseDate;
    private String quality;

    public Video(String title, double price, LocalDate releaseDate, String quality) {
        this.title = title;
        this.price = price;
        this.releaseDate = releaseDate;
        this.quality = quality;
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

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", quality='" + quality + '\'' +
                '}';
    }
}
