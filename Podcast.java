public class Podcast extends Content {
    private String host;
    private int episodeNumber;

    public Podcast(int contentId, String title, int duration, String host, int episodeNumber) {
        super(contentId, title, duration);
        this.host = host;
        this.episodeNumber = episodeNumber;
    }

    public String getHost() {
        return host;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Host" + host);
        System.out.println("Episode: " + episodeNumber);
    }

    @Override 
    public String toString() {
        return super.toString()
        + " Host " + host
                + ", Episode: " + episodeNumber;
    }
    
}