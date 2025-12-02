package com.restaurang;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    RealiseTabel rt = new RealiseTabel();
    @Test
    

    void CustomerDoseNotCome(){
        boolean customerCome = rt.tableFree();
        boolean customerDoNotCome = rt.tableFree();
        
        if (customerDoNotCome){
        
        assertTrue(true);
        
        }
        else {
            customerCome= true;
        }

    }
    @Test
     
    void tableGetsFreAfterFitheenMinutes(){
    

    Clock clockMock = mock(Clock.class);
    when(clockMock.millis()).thenReturn(900000L); //900000 är 15 min

    //ThreeMinutesSystemUpdate fmp = new ThreeMinutesSystemUpdate();
    ThreeMinutesSystemUpdate tmsu = new ThreeMinutesSystemUpdate(clockMock); // Vi återanvänder den gamla mocken
    

    assertEquals(15, tmsu.FiftheenMinutesPassed());

    

    //boolean expected = true;
    //assertTrue(expected);
    }
}

