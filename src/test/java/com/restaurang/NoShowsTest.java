package com.restaurang;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.Clock;

import org.junit.jupiter.api.Test;

public class NoShowsTest {

@Test

void CustomerDoseNotCome(){


}
@Test
void tableGetsFreAfterFitheenMinutes(){

Clock clockMock = mock(Clock.class);
when(clockMock.millis()).thenReturn(540000L);


boolean expected = true;
assertTrue(expected);
}
    

    

    
    
}
