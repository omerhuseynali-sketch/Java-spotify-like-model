import java.util.ArrayList;

public  class Playlist {

    private String playlistName;
    private ArrayList<Content> contents;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        contents = new ArrayList<>();
    }

    public String getplaylistName() {
        return playlistName;
    }

    public ArrayList<Content> getContents() {
        return contents;
    }

    public void addContent(Content content) {
        if (!contents.contains(content)) {
            contents.add(content);
        } else {
            System.out.println("This content is already in the playlist.");
        }
    }

    public void addContent(Content content, boolean showInfo) {
        if (!contents.contains(content)) {
            contents.add(content);
            if (showInfo) {
                System.out.println(content.getTitle() + "added to the playlist.");
            }
        } else {
            System.out.println("This content is already in the playlist");
        }
    }

    public boolean removeContent(Content content) {
        return contents.remove(content);
    }

    public void displayList() {
        System.out.println();
        System.out.println("----" + playlistName + "-----");
        for (Content content : contents) {
            System.out.println(content);
        }
    }

    public void playlist() {
        System.out.println();
        System.out.println(playlistName + " is playing..");
        for (Content content : contents) {
            System.out.println("-----------");
            content.play();
        }
    }

    public int calculateTotalDuration() {
        int totalDuration = 0;
        for (Content content : contents) {
            totalDuration += content.getDuration();
        }            
        return  totalDuration;
    }

    public Content findLongestContent() {
        if (contents.isEmpty()) {
            return null;
        }
        Content longestContent = contents.get(0);
        for (Content content : contents) {
            if (content.getDuration() > longestContent.getDuration()) {
                longestContent = content;
            }
        }
        return longestContent;
    }

    public Content findMostPlayedContent() {
        if (contents.isEmpty()) {
            return null;
        }

        Content mostPlayed = contents.get(0);
        for (Content content : contents) {
            if (content.getPlayCount() > mostPlayed.getPlayCount()) {
                mostPlayed = content;
            }
        }
        return mostPlayed;
    }

    public void listOnlySongs() {
        System.out.println("\nSongs:");
        for (Content content : contents) {
            if (content instanceof Song) {
                Song song = (Song) content;
                System.out.println(song.getTitle() + " - " + song.getArtist().getArtistName());
            }
        }
    }

    public void listOnlyPodcasts() {
        System.out.println("\nPodcasts");
        for (Content content : contents) {
            if (content instanceof Podcast) {
                Podcast podcast = (Podcast) content;
                System.out.println(podcast.getTitle() + " - " + podcast.getHost());
            }
        }
    }

    public void listSongsByArtist(Artist artist) {
        System.out.println();
        System.out.println("Songs by artist" + artist.getArtistName() + ":");
        for (Content content : contents) {
            if (content instanceof Song) {
                Song song = (Song) content;
                if (song.getArtist() == artist) {
                    System.out.println(song);
                }
            }
        }
    }

    @Override 
    public String toString() {
        return "Playlist:" + playlistName + ", Content Count:" + contents.size();
    }
    
}