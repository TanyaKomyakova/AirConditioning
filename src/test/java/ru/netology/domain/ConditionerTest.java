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
        conditioner.setCurrentTemperature(25);
        conditioner.increaseCurrentTemperature();
        int expected = 26;
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
        conditioner.setCurrentTemperature(18);
        conditioner.decreaseCurrentTemperature();
        int expected = 17;
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
        conditioner.setMinTemperature(14);
        int expected = 15;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseInMaximum(){
        Conditioner conditioner = new Conditioner();
        conditioner.getName();
        conditioner.getMinTemperature();
        conditioner.setOn(true);
        int expected = 30;
        conditioner.setCurrentTemperature(29);
        conditioner.getMaxTemperature();
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected,conditioner.getMaxTemperature());
    }

    @Test
    public void increaseInMinimum(){
        Conditioner conditioner = new Conditioner();
        conditioner.getName();
        conditioner.getMaxTemperature();
        conditioner.setOn(true);
        int expected = 15;
        conditioner.setCurrentTemperature(16);
        conditioner.getMinTemperature();
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected,conditioner.getMinTemperature());
    }

}

