package com.restaurang;
import java.time.*;

public class ThreeMinutesSystemUpdate {

private final Clock clock;

   
    public ThreeMinutesSystemUpdate(Clock clock){
        this.clock = clock; 
    }
     public int getThreeMinutesCounter(){
        return (int)(clock.millis()/180000);

    }
}
