package entity;

public class Resume{
    String id;
    String owner_id;
    String wanted_salary;
    String wanted_salary_rub;
    String age;
    String header;
    String personal_qualities;
    String institution;
    String education_specialty;
    String education_description;
    String experience;
    String url;
    String skills;
    String working_type;

    public Resume(String id, String owner_id, String wanted_salary, String wanted_salary_rub, String age, String header, String personal_qualities, String institution, String education_specialty, String education_description, String experience, String url, String skills, String working_type) {
        this.id = id;
        this.owner_id = owner_id;
        this.wanted_salary = wanted_salary;
        this.wanted_salary_rub = wanted_salary_rub;
        this.age = age;
        this.header = header;
        this.personal_qualities = personal_qualities;
        this.institution = institution;
        this.education_specialty = education_specialty;
        this.education_description = education_description;
        this.experience = experience;
        this.url = url;
        this.skills = skills;
        this.working_type = working_type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public String getWanted_salary() {
        return wanted_salary;
    }

    public void setWanted_salary(String wanted_salary) {
        this.wanted_salary = wanted_salary;
    }

    public String getWanted_salary_rub() {
        return wanted_salary_rub;
    }

    public void setWanted_salary_rub(String wanted_salary_rub) {
        this.wanted_salary_rub = wanted_salary_rub;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getPersonal_qualities() {
        return personal_qualities;
    }

    public void setPersonal_qualities(String personal_qualities) {
        this.personal_qualities = personal_qualities;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getEducation_specialty() {
        return education_specialty;
    }

    public void setEducation_specialty(String education_specialty) {
        this.education_specialty = education_specialty;
    }

    public String getEducation_description() {
        return education_description;
    }

    public void setEducation_description(String education_description) {
        this.education_description = education_description;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getWorking_type() {
        return working_type;
    }

    public void setWorking_type(String working_type) {
        this.working_type = working_type;
    }
}
