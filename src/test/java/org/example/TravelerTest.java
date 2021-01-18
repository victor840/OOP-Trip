package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class TravelerTest {
    Traveler traveler;

    @Before
    public void setUp() throws Exception {
        List<Destination> placesVisited = new ArrayList<>();
        placesVisited.add(new Destination("Indiana", 800.00, 0.50, false));
        CovidResults covidResults = new CovidResults(new Date(), false);
        traveler = new Traveler("Vick", "NupeNupe1911",10000.00, placesVisited, false, covidResults);
    }

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void getPassPortNo() {
    }

    @Test
    public void setPassPortNo() {
    }

    @Test
    public void getMoney() {
    }

    @Test
    public void setMoney() {
    }

    @Test
    public void getPlacesVisited() {
    }

    @Test
    public void setPlacesVisited() {
    }

    @Test
    public void getNoFlyList() {
    }

    @Test
    public void setNoFlyList() {
    }

    @Test
    public void getCovidResults() {
    }

    @Test
    public void setCovidResults() {
    }

    @Test
    public void booATrip() {
    }
}