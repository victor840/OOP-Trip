package org.example;

import java.util.List;

public class Traveler {
    private String name;
    private String passPortNo;
    private Double money;
    private List<Destination> placesVisited;
    private Boolean noFlyList;
    private CovidResults covidResults;

    public Traveler(String name, String passPortNo, Double money, List<Destination> placesVisited, Boolean noFlyList, CovidResults covidResults) {
        this.name = name;
        this.passPortNo = passPortNo;
        this.money = money;
        this.placesVisited = placesVisited;
        this.noFlyList = noFlyList;
        this.covidResults = covidResults;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassPortNo() {
        return passPortNo;
    }

    public void setPassPortNo(String passPortNo) {
        this.passPortNo = passPortNo;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public List<Destination> getPlacesVisited() {
        return placesVisited;
    }

    public void setPlacesVisited(List<Destination> placesVisited) {
        this.placesVisited = placesVisited;
    }

    public Boolean getNoFlyList() {
        return noFlyList;
    }

    public void setNoFlyList(Boolean noFlyList) {
        this.noFlyList = noFlyList;
    }

    public CovidResults getCovidResults() {
        return covidResults;
    }

    public void setCovidResults(CovidResults covidResults) {
        this.covidResults = covidResults;
    }

    public void booATrip(Destination destination){

    }

}
