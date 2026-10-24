import java.util.ArrayList;

public class Artist {

    private String artistName;
    private String genre;

    private ArrayList<Song> songs;

    public Artist(String artistName, String genre) {
        this.artistName = artistName;
        this.genre = genre;
        songs = new ArrayList<>();
    }

    public String getArtistName() {
        return artistName;
    }

    public String getGenre() {
        return genre;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        if (!songs.contains(song)) {
            songs.add(song);
        }
    }

    public void listSongs() {
        System.out.println("\n Songs by artist " + artistName + ":");
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    @Override
    public String toString() {
        return "Artist: " + artistName + ",Genre:" + genre + ", Song Count: " + songs.size();
    }
}