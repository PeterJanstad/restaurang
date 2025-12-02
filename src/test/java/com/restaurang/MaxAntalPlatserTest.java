package com.restaurang;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxAntalPlatserTest {
    
    MaxAntalPlatser platser = new MaxAntalPlatser();

    @Test
    void maxSeatShouldBeSixty(){

    
    int actualSeats = platser.getMaxSeats();
assertEquals(60,actualSeats);
    }
}
