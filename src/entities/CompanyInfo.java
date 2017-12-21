package entities;

public class CompanyInfo {
    private String companyName;
    private String companyPhoneNum;
    private String companyAddr;
    private String chargePerson;
    private Integer salary;
    private String companyDescribe;
    private String netAddr;
    private String position;

    public String getCompanyName() {
        return companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyPhoneNum() {
        return companyPhoneNum;
    }

    public void setCompanyPhoneNum(String companyPhoneNum) {
        this.companyPhoneNum = companyPhoneNum;
    }

    public String getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
    }

    public String getChargePerson() {
        return chargePerson;
    }

    public void setChargePerson(String chargePerson) {
        this.chargePerson = chargePerson;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getCompanyDescribe() {
        return companyDescribe;
    }

    public void setCompanyDescribe(String companyDescribe) {
        this.companyDescribe = companyDescribe;
    }

    public String getNetAddr() {
        return netAddr;
    }

    public void setNetAddr(String netAddr) {
        this.netAddr = netAddr;
    }
}
