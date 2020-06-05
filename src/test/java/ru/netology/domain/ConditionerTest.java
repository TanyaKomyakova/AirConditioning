package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @org.junit.jupiter.api.Test
    void TestIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.getName();
        conditioner.getMaxTemperature();
        conditioner.getMinTemperature();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        int expected = 30;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);

    }

    @Test
    public void TestdecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.getName();
        conditioner.getMaxTemperature();
        conditioner.getMinTemperature();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(15);
        conditioner.decreaseCurrentTemperature();
        int expected = 15;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void impossibleToGoBeyondTheMaximum() {
        Conditioner conditioner = new Conditioner();
        conditioner.getName();
        conditioner.getMaxTemperature();
        conditioner.getMinTemperature();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(30);
        conditioner.setMaxTemperature(31);
        int expected = 30;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void impossibleToGoBeyondTheMiniimum() {
        Conditioner conditioner = new Conditioner();
        conditioner.getName();
        conditioner.getMaxTemperature();
        conditioner.getMinTemperature();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(15);
        conditioner.setMaxTemperature(14);
        int expected = 15;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }
}

