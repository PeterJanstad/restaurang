package com.restaurang;
import java.time.*;

public class ThreeMinutesSystemUpdate {

// Koden är AI genererad för att lära oss. 
    
private final Clock clock;

   
     public ThreeMinutesSystemUpdate(Clock clock){  //En okänd klock som vi kan använda för fejka tiden med hjälp av Mockito
        this.clock = clock; 
    }
     public int getThreeMinutesCounter(){
        return (int)(clock.millis() / 180000);
        //return 3;
    }

    public int FiftheenMinutesPassed(){
        //return 15;
      return (int)(clock.millis() /60000); //Vi delar 900000 / 60000
    }
}
