
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSong {
    static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("Song.html")));
            //System.out.println(content);
            //content = content.replaceAll("\\n+", "");
            //System.out.println(content);
            String regex = "class=\"name_song\"[^>]*>(.*?)</a>";
            Pattern pattern = Pattern.compile(regex, Pattern.DOTALL | Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(content);
            System.out.println("--- Danh sách bài hát ---");
            while (matcher.find()) {
                System.out.println(matcher.group(1).trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
