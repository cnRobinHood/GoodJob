package entities;

public class UserInfo {
    private String username;
    private String realname;
    private Integer age;
    private String school;
    private String eduBackground;
    private String brief;//简介
    private String gender;
    private String jobIntension;
    private String salaryIntension;
    private String cityIntension;
    private String photoSrc;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getEduBackground() {
        return eduBackground;
    }

    public void setEduBackground(String eduBackground) {
        this.eduBackground = eduBackground;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJobIntension() {
        return jobIntension;
    }

    public void setJobIntension(String jobIntension) {
        this.jobIntension = jobIntension;
    }

    public String getSalaryIntension() {
        return salaryIntension;
    }

    public void setSalaryIntension(String salaryIntension) {
        this.salaryIntension = salaryIntension;
    }

    public String getCityIntension() {
        return cityIntension;
    }

    public void setCityIntension(String cityIntension) {
        this.cityIntension = cityIntension;
    }

    public String getPhotoSrc() {
        return photoSrc;
    }

    public void setPhotoSrc(String photoSrc) {
        this.photoSrc = photoSrc;
    }
}
