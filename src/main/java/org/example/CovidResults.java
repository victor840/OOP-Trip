package org.example;

import java.util.Date;

public class CovidResults {
    private Date date;
    private Boolean covidPositive;

    public CovidResults(Date date, Boolean covidPositive) {
        this.date = date;
        this.covidPositive = covidPositive;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getCovidPositive() {
        return covidPositive;
    }

    public void setCovidPositive(Boolean covidPositive) {
        this.covidPositive = covidPositive;
    }

    public void getDate(Date date){

    }

}

