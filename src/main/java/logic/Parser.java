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

    public Parser() {
    getMenuList();
    getResumeList();





}
    public void getMenuList(){
        try {
            document = Jsoup.connect(URL).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        title = document.title();

        categoryList = document.select("a[data-analytic=\"clickRubricatorResume\"]");


        for (Element element : categoryList
                ) {
            System.out.println(element);
            System.out.println(element.attr("abs:href"));
            //System.out.println(element.text());
        }

        System.out.println(title);
    }
    public void getResumeList(){
        try {
             document = Jsoup.connect("http://ekb.zarplata.ru/resume?state%5B%5D=1&visibility_type=1&average_salary=1&categories_facets=1&city_id%5B%5D=994&rubric%5B%5D=1&limit=25").timeout(1000000)
                    .header("Accept", "text/javascript")
                    .userAgent("Mozilla/5.0 (Windows NT 6.1; rv:40.0) Gecko/20100101 Firefox/40.0")
                    .get()
                    ;
            System.out.println(document);
            //document = Jsoup.connect("http://ekb.zarplata.ru/resume?state%5B%5D=1&visibility_type=1&average_salary=1&categories_facets=1&city_id%5B%5D=994&rubric%5B%5D=1&limit=25").get();
            //document = Jsoup.connect(categoryList.get(0).attr("abs:href")).timeout(0).get();
            //System.out.println(document.toString());
            //document = Jsoup.connect(categoryList.get(0).attr("abs:href")).data("state[]","1").data("visibility_type","1").data("average_salary","1").data("categories_facets","1").data("city_id[]","994").data("rubric[]","1").data("limit", "25").data("offset","50").post();
            //document = Jsoup.parse(categoryList.get(0).attr("abs:href"), 10000);
            //title = document.title();
            //resumeList = document.select("div[data-type=\"resumes\"]");
            //resumeList = document.select("a").attr("class","ra-elements-list__card__title");
            //resumeList = document.select("ul").attr("class", "ra-elements-list-hidden");
           //resumeList = document.select("div").attr("data-type", "resumes").select("li");
           //resumeList = document.select("div").attr("class","ra-elements-list__item").attr("data-id", "39140625").attr("data-analytic", "");

        } catch (IOException e) {
            e.printStackTrace();
        }
//        for (Element element : resumeList
//                ) {
//           System.out.println(element);
//            //System.out.println(element.attr("abs:href"));
//            //System.out.println(element.text());
//        }


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