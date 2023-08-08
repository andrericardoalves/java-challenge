package org.example;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class CalendarClassTest {

    @Test
    public void testCalendarMethodGetActualMaximum(){
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.set(Calendar.DATE, c.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(c.getTime());
    }

}
