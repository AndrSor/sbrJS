import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws BrowsPageExeption {



        do {
            try {
                System.out.println(getHTMLFromUrl(getUserUrl() ));
            } catch (BrowsPageExeption e) {
                //System.out.println("BrowsPageExeption");
                e.printStackTrace();
            }
            System.out.println("Запросить еще стратницу? (Y/N)");
            //String makeNextQuery = ;
        } while(scanner.next().equalsIgnoreCase("Y"));
    }

    public static String getUserUrl() {
        System.out.println();
        System.out.println("Введите URL страницы");
        return scanner.next();
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
            throw new BrowsPageExeption("Ошибка при попытке получения страницы");
        }
            //stringBuilder.append(System.getProperty("line.separator"));


        return stringBuilder.toString();
    };
}

