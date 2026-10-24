import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Artist artist1 = new Artist("Deniz", "Pop");
        Artist artist2 = new Artist("Ece", "Rock");

        Song song1 = new Song(1, "Night Journey", 210, artist1, "Road", "Pop");
        Song song2 = new Song(2, "Silent streets", 250, artist1, "Road", "Rock");
        Song song3 = new Song(3, "Autumn", 190, artist2, "Seasons", "Rock");

        Podcast podcast1 = new Podcast(4, "AI Conversations", 1800, "Ayse", 12);
        Podcast podcast2 = new Podcast(5, "Tech agenda", 2400, "MEhmet", 8);

        User user = new User("merve06", "Merve", true);

        Playlist favorites = user.createPlayList("Favorites");
        Playlist roadTrip = user.createPlayList("Road trip");

        favorites.addContent(song1, true);
        favorites.addContent(song2);
        favorites.addContent(podcast1);
        roadTrip.addContent(song3);
        roadTrip.addContent(podcast2);

        System.out.println("\nUser");
        System.out.println(user);
        user.displayPlaylists();
        favorites.displayList();

        System.out.println("\n Polymorphism");


        Content content1 = new Song(6, "Sky", 200, artist2, "Blue", "pop");
        Content content2 = new Podcast(7, "World of science", 1500, "Can", 4);

        content1.play();
        System.out.println();
        content2.play();

        favorites.playlist();

        song1.play();
        song1.play();

        podcast1.play();
        System.out.println("Total duration:" + favorites.calculateTotalDuration() + " seconds");

        Content longest = favorites.findLongestContent();
        System.out.println("\nLongest content:");
        System.out.println(longest);

        Content mostPlayed = favorites.findMostPlayedContent();
        System.out.println("\nMost played content:");
        System.out.println(mostPlayed);

        System.out.println("\nInstancesof and Casting");

        if (content1 instanceof Song) {
            Song song = (Song) content1;
            System.out.println("Song artist:" + song.getArtist().getArtistName());
            System.out.println("Album: " + song.getAlbum());
        }

        favorites.listOnlySongs();
        favorites.listOnlyPodcasts();
        favorites.listSongsByArtist(artist1);

        artist1.listSongs();
        Song testSong1 = new Song(100, "SOng-ads", 0, artist1, "Album-a", "Pop");
        Song testSong2 = new Song(101, "Song-b", 250, artist2, "Album B", "Rock");

        System.out.println("\n==result: " + (testSong1 == testSong2));
        System.out.println("equals result: " + testSong1.equals(testSong2));
        System.out.println();

        System.out.println();

        System.out.println("Total content count: " + Content.getContentCount());
        System.out.println("Platform name: " + Content.PLATFORM_NAME);
        song1.displayPlatformInfo();

    }
}