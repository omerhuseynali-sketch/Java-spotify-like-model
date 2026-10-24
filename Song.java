public class Song extends Content {
    private Artist artist;
    private String album;
    private String genre;

    public Song(int contentId, String title, int duration, Artist artist, String album, String genre) {
        super(contentId, title, duration);
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        artist.addSong(this);
    }

    public Artist getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenre() {
        return genre;
    }
    @Override 
    public void play() {
        super.play();
        System.out.println("Artist: " + artist.getArtistName());
        System.out.println("Album: " + album);
    }

    @Override 
    public String toString() {
        return  super.toString()
        + " Artist: " + artist.getArtistName()
        + " Album: " + album
                + ", Genre: " + genre;
    }
}