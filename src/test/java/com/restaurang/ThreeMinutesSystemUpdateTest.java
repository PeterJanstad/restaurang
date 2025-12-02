package com.restaurang;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.Clock;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class ThreeMinutesSystemUpdateTest {

    @Test 
    
    void ThreeMinutesUpdate(){
    Clock clockMock = mock(Clock.class);


     when(clockMock.millis()).thenReturn(540000L);  


    ThreeMinutesSystemUpdate tmsu = new ThreeMinutesSystemUpdate(clockMock);

    int threeMinutesPassed = tmsu.getThreeMinutesCounter();
    assertEquals(3, threeMinutesPassed);
    }
    
}
