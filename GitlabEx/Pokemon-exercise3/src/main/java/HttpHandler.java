import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class HttpHandler {

    public static String makeHTTPRequestForLavenderTown() {
        String urlString = "https://pokeapi.co/api/v2/pokemon\n";
        String response = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            Scanner responseScanner = new Scanner(connection.getInputStream());
            while (responseScanner.hasNext()) {
                response = responseScanner.nextLine();
                System.out.println(response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

}

