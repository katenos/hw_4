/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_4_1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author kate_
 */
public class DateHelper {

    Date startDate= new Date();
    Date currentDate= new Date();
    static final int DURATION=45;
    SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm");

    public String getFormattedStartDate() {
        return format1.format(startDate);
    }

    public void skipTime() {
        currentDate.setTime(startDate.getTime()+DURATION);
    }

    public String getFormattedDiff() {
        return format1.format(currentDate.getTime()-startDate.getTime());
    }
}
