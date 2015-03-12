/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk8.api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author nmarks3
 */
public class NewClass { 
    public static void main(String[] args) {
            LocalDate local = LocalDate.now();
    local = local.with(TemporalAdjusters.firstDayOfNextMonth());
   
    while(local.getMonthValue()== 4){
        System.out.println(local);
        local = local.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
    }
    }
    

    
}
