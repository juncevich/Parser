package logic;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class Parser {



    public static void main(String[] args) throws IOException {
        Document document;
        String URL = "http://ekb.zarplata.ru/";
        String title = null;

        try {
            document = Jsoup.connect(URL).get();
            title = document.title();
//            Elements mainHeaderElements = document.select("nav.ra-rubricator-entity-categories");
//            for (Element element: mainHeaderElements
//                 ) {
//                System.out.println(element);
//            }

            //Elements mainHeaderElements1 = document.select("li.ra-rubricator-entity-item");
            Elements mainHeaderElements1 = document.select("a[data-analytic=\"clickRubricatorResume\"]");


            for (Element element: mainHeaderElements1
                    ) {
                System.out.println(element);
                //System.out.println(element.text());
            }
            //Elements title1 = doc.select("<document>");
            //Elements title1 = document.select("body");
            //System.out.println(title1.get(1));
            //System.out.println(title1.toString());
            System.out.println(title);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println("Jsoup Can read HTML page from URL, title : " + title);

    }}