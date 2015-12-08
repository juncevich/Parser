package logic;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class Parser {
    static Document document;
    static Elements categoryList;
    static Elements resumeList;
    String title = null;
    static String URL = "http://ekb.zarplata.ru/";

    public Parser() throws IOException {


    document = Jsoup.connect(URL).get();
    title = document.title();
//            Elements mainHeaderElements = document.select("nav.ra-rubricator-entity-categories");
//            for (Element element: mainHeaderElements
//                 ) {
//                System.out.println(element);
//            }

        //Elements mainHeaderElements1 = document.select("li.ra-rubricator-entity-item");
    categoryList = document.select("a[data-analytic=\"clickRubricatorResume\"]");


        for (Element element : categoryList
                ) {
            System.out.println(element);
            System.out.println(element.attr("href"));
            //System.out.println(element.text());
        }
        //Elements title1 = doc.select("<document>");
        //Elements title1 = document.select("body");
        //System.out.println(title1.get(1));
        //System.out.println(title1.toString());
        System.out.println(title);


//        System.out.println("Jsoup Can read HTML page from URL, title : " + title);

}
    public Elements getResumeList(String categoryName){
        try {
            document = Jsoup.connect(URL + categoryName).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resumeList;
    }
    public static Elements getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(Elements categoryList) {
        this.categoryList = categoryList;
    }

    public static Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}