package com.restaurang;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.*;

import org.junit.jupiter.api.Test;

public class ThreeMinutesSystemUpdateTest {

    ThreeMinutesSystemUpdate tmsu = new ThreeMinutesSystemUpdate(Clock);
    @Test 
    
    void ThreeMinutesUpdate(){
    
    int threeMinutesPassed = tmsu.getThreeMinutesCounter();
    assertEquals(3, threeMinutesPassed);
    }
    
}
