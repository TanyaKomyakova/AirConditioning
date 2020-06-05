package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @org.junit.jupiter.api.Test
    void testIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(15);
        conditioner.increaseCurrentTemperature();
        int expected = 16;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void testdecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(16);
        conditioner.decreaseCurrentTemperature();
        int expected = 15;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void impossibleToGoBeyondTheMaximum() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(29);
        conditioner.increaseCurrentTemperature();
        int expected = 30;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void impossibleToGoBeyondTheMiniimum() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(16);
        conditioner.decreaseCurrentTemperature();
        int expected = 15;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseInMaximum(){
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(24);
        conditioner.setCurrentTemperature(35);
        int expected = 24;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);

    }

    @Test
    public void increaseInMinimum(){
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(18);
        conditioner.setCurrentTemperature(10);
        int expected = 18;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

}

