package utils;

import entity.Resume;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


public class Parser {
    private static Document document;
    private static Elements categoryList;
    static Elements resumeList;
    static JSONObject jsonObject;
    static JSONArray jsonArray;
    static int limit = 50;
    public Parser() {
        getMenuList();



    }

    private static void getMenuList() {
        try {
            String URL = "http://ekb.zarplata.ru/";
            document = Jsoup.connect(URL).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        categoryList = document.select("a[data-analytic=\"clickRubricatorResume\"]");

//        for (Element element : categoryList
//                ) {
//            System.out.println(element);
//            System.out.println(element.attr("abs:href"));
//
//        }

    }

    public static List<Resume> getResumeList(int category) {
        List<Resume> resumeList = new LinkedList<>();
        JSONArray jsonArray = getDocument(getResumeJsonByCategory(category));
        for (int i = 0; i < jsonArray.length(); i++) {
            Resume resume= new Resume();
            resume.setId(jsonArray.getJSONObject(i).optString("id"));
            resume.setOwner_id(jsonArray.getJSONObject(i).optString("owner_id"));
            resume.setWanted_salary(jsonArray.getJSONObject(i).optString("wanted_salary"));
            resume.setAge(jsonArray.getJSONObject(i).optString("age"));
            resume.setPersonal_qualities(jsonArray.getJSONObject(i).optString("personal_qualities"));
            resume.setInstitution(jsonArray.getJSONObject(i).optString("institution"));
            resume.setEducation_specialty(jsonArray.getJSONObject(i).optString("education_specialty"));
            resume.setEducation_description(jsonArray.getJSONObject(i).optString("education_description"));
            resume.setExperience(jsonArray.getJSONObject(i).optString("experience"));
            resume.setSkills(jsonArray.getJSONObject(i).optString("skills"));

            resumeList.add(resume);
        }

        return resumeList;
    }


    public static JSONArray getDocument(String document) throws JSONException {

            jsonObject = new JSONObject(document);
            jsonArray = jsonObject.getJSONArray("resumes");


                return jsonArray;





    }

    public static String getResumeJsonByCategory(int categoryId){
        try {
            document = Jsoup.connect("http://ekb.zarplata.ru/api/v1/resumes/?state%5B%5D=1" +
                    "&visibility_type=1&average_salary=true&categories_facets=1&city_id%5B%5D=994" +
                    "&rubric%5B%5D=" + categoryId + "&limit="+ limit +"&offset=0&fields=add_date%2Cmod_date" +
                    "%2Cage_pretty%2Cattachment%2Cbirthday%2Ccontact%2Ceducation%2Ceducation_specialty" +
                    "%2Cexperience%2Cexperience_length%2Cexperience_prune%2Cheader%2Cid%2Cinfo%2Cis_upped" +
                    "%2Cis_journey%2Cjobs%2Cowner_id%2Cphoto%2Csalary%2Cstate%2Curl%2Cvalidate_state%2Cviews" +
                    "%2Chide_birthday%2Csex")
                    .header("Accept", "text/*").ignoreContentType(true)
                    .userAgent("Mozilla/5.0 (Windows NT 6.1; rv:40.0) Gecko/20100101 Firefox/40.0")
                    .get();

            String resumeListJson = document.select("body").text();

            return resumeListJson;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
    public static Elements getCategoryList() {
        return categoryList;
    }


    public static Document getDocument() {
        return document;
    }



}