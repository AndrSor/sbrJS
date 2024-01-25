import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws BrowsPageExeption {
        Scanner scanner = new Scanner(System.in);
        String url;
        System.out.println("Введите URL страницы");
        url = scanner.next();

        //System.out.println(url);
        try {
            System.out.println(getHTMLFromUrl(url));
        } catch (BrowsPageExeption e) {
            System.out.println("BrowsPageExeption");
        } catch (IOException e){
            System.out.println("IOException");
        }


    }



    public static String getHTMLFromUrl(String url) throws BrowsPageExeption {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            URL streamUrl = new URL(url);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            streamUrl.openStream()));

            String inputLine = null;
            while ((inputLine = in.readLine()) != null)
                stringBuilder.append(inputLine);
            in.close();
        }catch (IOException e){
            throw new BrowsPageExeption(e);
        }
            //stringBuilder.append(System.getProperty("line.separator"));


        return stringBuilder.toString();
    };
}

