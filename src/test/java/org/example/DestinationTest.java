package org.example;

import org.example.exceptions.InsufficientFundsException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class DestinationTest {
    Destination destination;

    @Before
    public void setUp() throws Exception {
        destination = new Destination("Tulum", 2000.00, 50.00, true);
    }

    @Test (expected = InsufficientFundsException.class)
    public void allowToVisit() throws InsufficientFundsException { // Need to review this
        List<Destination> placesVisted = new ArrayList<>();
        placesVisted.add(destination);
        CovidResults covidResults = new CovidResults( new Date(), false );
        Traveler traveler = new Traveler("Eduardo", "12345", 00.00,
                placesVisted, false, covidResults);
        destination.allowToVisit(traveler);
    }

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void getDistance() {
    }

    @Test
    public void setDistance() {
    }

    @Test
    public void getCostPerMile() {
    }

    @Test
    public void setCostPerMile() {
    }

    @Test
    public void getRequireCovidTest() {
    }

    @Test
    public void setRequireCovidTest() {
    }
}