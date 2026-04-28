import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlRegexExtractor {
    static void main(String[] args) {
        String url = "https://www.google.com";
        String url2 = "https://vnexpress.net/nhung-quy-dinh-moi-ve-cong-chung-vua-duoc-quoc-hoi-thong-qua-5067604.html";
        String url3 = "https://vnexpress.net/tong-bi-thu-chu-tich-nuoc-tp-hcm-can-tim-mo-hinh-phat-trien-moi-5067614.html";
        try {
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url3)).build();
            String htmlContent = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString()).body();
            //System.out.println(htmlContent);
            System.out.println("--- Trích xuất bằng Regex ---");
            String regex = "<title>(.*?)</title>";
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(htmlContent);
            if (matcher.find()) {
                System.out.println("Tiêu đề trang: " + matcher.group(1));
            }
        } catch (Exception e) {
            System.out.println("Trương trình gặp lỗi " + e.getMessage());
        }
    }
}
