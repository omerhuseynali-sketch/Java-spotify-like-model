public class Content {
    private int contentId;
    private String title;
    private int duration;
    private int playCount;

    private static int contentCount = 0;
    public static final String PLATFORM_NAME = "MiniSpotify";

    public Content(int contentId, String title, int duration) {
        this.contentId = contentId;
        this.title = title;
        this.duration = duration;
        this.playCount = 0;
        contentCount++;
    }

    public int getContentId()
    {
        return contentId;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public int getPlayCount() {
        return playCount;
    }

    public static int getContentCount() {
        return contentCount;
    }

    public void play() {
        playCount++;
        System.out.println("Content is playing: " + title);
    }

    public final void displayPlatformInfo() {
        System.out.println("Platform: " + PLATFORM_NAME);
    }

    @Override
    public String toString() {
        return "Content ID:" + contentId + "Title:" + title + "Duration:" + duration + " seconds" + "Play count"
                + playCount;
    }
    @Override 
    public boolean equals(Object obj) {
        if (obj instanceof Content) {
            Content otherContent = (Content) obj;
            return this.contentId == otherContent.contentId;
        }
        return false;
    }
}