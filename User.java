import java.util.ArrayList;

public class User {
    private String username;
    private String fullName;
    private boolean premium;
    private ArrayList<Playlist> playlists;

    public User(String username, String fullName, boolean premium) {
        this.username = username;
        this.fullName = fullName;
        this.premium = premium;
        playlists = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getFullname() {
        return fullName;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public Playlist createPlayList(String playlistName) {
        Playlist newList = new Playlist(playlistName);
        playlists.add(newList);
        return newList;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void displayPlaylists() {
        System.out.println();
        System.out.println(fullName + "'s playlists:'");
        for (Playlist liste : playlists) {
            System.out.println(liste);
        }
    }

    @Override 
    public String toString() {
        return "Username" + username + "Full name" + fullName + "Premium" + premium;
    }
}