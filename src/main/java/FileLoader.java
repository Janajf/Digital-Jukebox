import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class FileLoader {

    private final String songFile;

    public FileLoader(String songFile) {
        this.songFile = songFile;
    }


    public  Map<String,Song> load() throws FileNotFoundException {

        Map<String,Song> mapOfSongs = new TreeMap<>();

        File songs = new File(songFile);

        try(Scanner scanner = new Scanner(songs)){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();

                 String[] values = lineDivider(line);

                 Song song = createSong(values);

                 String songNumber = values[0];

                 mapOfSongs.put(songNumber,song);

            }
        }
        return mapOfSongs;
    }


    // create instance of a song
    private static Song createSong(String[] values){

        String title = values[1];
        String album = values[2];
        String artist = values[3];
        String genre = values[4];
        String releaseDate = values[5];
        int length = Integer.parseInt(values[6]);

        Song newSong = new Song(title,album,artist,genre, releaseDate,length);
        return newSong;
    }

    // split each line into an array
    private static String[] lineDivider(String line) {
        String[] values = line.split("\\|");
        return values;
    }
}
