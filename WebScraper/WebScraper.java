/*Web scraping with java
* Get the html contents of any specified website
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WebScraper {
    public static void main (String args[]) throws MalformedURLException, IOException {
        System.out.println();
        try{
            StringBuilder content = new StringBuilder();
            URL url = new URL("https://www.google.com");
            URLConnection urlConnection = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        }
        catch(Exception e){
            System.out.println("Unable to connect to website");
        }

    }
}

