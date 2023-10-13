import java.util.HashMap;

public class SongMap {
    public static void main(String[] args) {
        // Create a trackList of type HashMap
        HashMap<String, String> trackList = new HashMap<>();

        // Add songs to the trackList HashMap
        trackList.put("Song 1", "Lyrics 1");
        trackList.put("Song 2", "Lyrics 2");
        trackList.put("Song 3", "Lyrics 3");
        trackList.put("Song 4", "Lyrics 4");

        // Retrieve a song by its track title
        String songTitle = "Song 2";
        String lyrics = trackList.get(songTitle);
        System.out.println("Lyrics of " + songTitle + ": " + lyrics);

        // Print all track names and lyrics
        for (String track : trackList.keySet()) {
            System.out.println("Track: " + track + ", Lyrics: " + trackList.get(track));
        }
    }
}
