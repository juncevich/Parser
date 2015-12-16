package utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class Parser {
    private static Document document;
    private static Elements categoryList;
    static Elements resumeList;
    private static final String URL = "http://ekb.zarplata.ru/";

    public Parser() {
        getMenuList();
        getResumeList("50");


    }

    private void getMenuList() {
        try {
            document = Jsoup.connect(URL).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String title = document.title();

        categoryList = document.select("a[data-analytic=\"clickRubricatorResume\"]");


        for (Element element : categoryList
                ) {
            System.out.println(element);
            System.out.println(element.attr("abs:href"));

        }

        System.out.println(title);
    }

    private void getResumeList(String categoryId) throws JSONException {
        try {
            document = Jsoup.connect("http://ekb.zarplata.ru/api/v1/resumes/?state%5B%5D=1&visibility_type=1&average_salary=true&categories_facets=1&city_id%5B%5D=994&rubric%5B%5D=" + categoryId + "&limit=25&offset=0&fields=add_date%2Cmod_date%2Cage_pretty%2Cattachment%2Cbirthday%2Ccontact%2Ceducation%2Ceducation_specialty%2Cexperience%2Cexperience_length%2Cexperience_prune%2Cheader%2Cid%2Cinfo%2Cis_upped%2Cis_journey%2Cjobs%2Cowner_id%2Cphoto%2Csalary%2Cstate%2Curl%2Cvalidate_state%2Cviews%2Chide_birthday%2Csex")
                    .header("Accept", "text/*").ignoreContentType(true)
                    .userAgent("Mozilla/5.0 (Windows NT 6.1; rv:40.0) Gecko/20100101 Firefox/40.0")
                    .get()
            ;
            String resumeListJson = document.select("body").text();
            //System.out.println(resumeListJson);
            JSONObject jsonObject = new JSONObject(resumeListJson);
            JSONArray jsonArray = jsonObject.getJSONArray("resumes");

            for (int i = 0; i < jsonArray.length(); i++) {
                String resume_id = jsonArray.getJSONObject(i).optString("id");
                String resume_owner_id = jsonArray.getJSONObject(i).optString("owner_id");
                String resume_wanted_salary = jsonArray.getJSONObject(i).optString("wanted_salary");
                String resume_wanted_salary_rub = jsonArray.getJSONObject(i).optString("wanted_salary_rub");
                String resume_age = jsonArray.getJSONObject(i).optString("age");
                String resume_header = jsonArray.getJSONObject(i).optString("header");
                String resume_personal_qualities = jsonArray.getJSONObject(i).optString("personal_qualities");
                String resume_institution = jsonArray.getJSONObject(i).optString("institution");
                String resume_education_specialty = jsonArray.getJSONObject(i).optString("education_specialty");
                String resume_education_description = jsonArray.getJSONObject(i).optString("education_description");
                String resume_experience = jsonArray.getJSONObject(i).optString("experience");
                String resume_url = jsonArray.getJSONObject(i).optString("url");
                String resume_skills = jsonArray.getJSONObject(i).optString("skills");

                String resume_working_type = jsonArray.getJSONObject(i).optString("working_type");


                System.out.println(resume_id);
                System.out.println(resume_owner_id);
                System.out.println(resume_wanted_salary);
                System.out.println(resume_wanted_salary_rub);
                System.out.println(resume_age);
                System.out.println(resume_header);
                System.out.println(resume_personal_qualities);
                System.out.println(resume_institution);
                System.out.println(resume_education_specialty);
                System.out.println(resume_education_description);
                System.out.println(resume_experience);
                System.out.println(resume_url);
                System.out.println(resume_skills);

                System.out.println(resume_working_type);
                System.out.println("------------------------------------------------------------------------");

            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static Elements getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(Elements categoryList) {
        Parser.categoryList = categoryList;
    }

    public static Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        Parser.document = document;
    }
}