package com.tywh.kdterp.pojo;

public class Condition {

    private String bjbmmc;

    private String xsbmmc;

    private String tsfljc;

    private String startdate;

    private String enddate;

    private final String[] fhzts = {"待发","已发"};

    private final String[] tsfljcRemove = {"'%联考%'","'日历%'","'赠品%'","'宣传品%'"};

    private final String khbhRemove = "2000000747";

    private final String sxhRemove = "'W%'";

    private final String kwbh = "00HG";

    private final String kjqj = "2020-01";

    public String getBjbmmc() {
        return bjbmmc;
    }

    public void setBjbmmc(String bjbmmc) {
        this.bjbmmc = bjbmmc;
    }

    public String getXsbmmc() {
        return xsbmmc;
    }

    public void setXsbmmc(String xsbmmc) {
        this.xsbmmc = xsbmmc;
    }

    public String getTsfljc() {
        return tsfljc;
    }

    public void setTsfljc(String tsfljc) {
        this.tsfljc = tsfljc;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String[] getFhzts() {
        return fhzts;
    }

    public String[] getTsfljcRemove() {
        return tsfljcRemove;
    }

    public String getKhbhRemove() {
        return khbhRemove;
    }

    public String getSxhRemove() {
        return sxhRemove;
    }

    public String getKwbh() {
        return kwbh;
    }

    public String getKjqj() {
        return kjqj;
    }
}
