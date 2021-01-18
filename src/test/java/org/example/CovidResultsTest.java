package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class CovidResultsTest {
    CovidResults covidResults;

    @Before
    public void setUp() throws Exception {
        Date dateReference = new Date();
        covidResults = new CovidResults(dateReference, true);
    }

    @Test
    public void getDate() {
    }

    @Test
    public void setDate() {
    }

    @Test
    public void getCovidPositive() {
    }

    @Test
    public void setCovidPositive() {
    }

    @Test
    public void testGetDate() {
    }
}