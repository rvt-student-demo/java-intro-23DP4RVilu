package lv.rvt;

public class CD implements packable {
    private String artist;
    private String albumTitle;
    private int year;
    private double weight;

    public CD(String artist, String albumTitle, int year) {
        this.artist = artist;
        this.albumTitle = albumTitle;
        this.year = year;
        this.weight = 0.1;
    }

    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.albumTitle + " (" + this.year + ")";
    }
    
}
