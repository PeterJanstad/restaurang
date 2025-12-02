package com.restaurang;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.Clock;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class ThreeMinutesSystemUpdateTest {

    @Test 
    // Koden är AI skriven för att få ett fungerande exmpel där vad som händer. 
    void ThreeMinutesUpdate(){
    Clock clockMock = mock(Clock.class); //våran StuntDubbel


     when(clockMock.millis()).thenReturn(540000L);   //Value 540000L är våran Stubbe 


    ThreeMinutesSystemUpdate tmsu = new ThreeMinutesSystemUpdate(clockMock); //Vi hämtar värdet från main.

    int threeMinutesPassed = tmsu.getThreeMinutesCounter();
    assertEquals(3, threeMinutesPassed);
    }
    
    @Test

    void CustomerDoseNotCome(){


    }
    @Test
    void tableGetsFreAfterFitheenMinutes(){

    Clock clockMock = mock(Clock.class);
    when(clockMock.millis()).thenReturn(900000L);

    int FiftheenMinutesPassed = fmp.FiftheenMinutesPassed();

    //boolean expected = true;
    //assertTrue(expected);
    }
}

