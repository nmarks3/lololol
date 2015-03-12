
package old.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class NewClass {
    
    public static void main(String[] args) throws ParseException {
        
        Calendar c1 = Calendar.getInstance();
//        c1.set(2002, Calendar.FEBRUARY, 23);
        c1.add(Calendar.YEAR, -2); // go backwords in time, subsitute YEAR with MONTH, DAY_OF_MONTH, ect.
        Date now = c1.getTime();
        
//        Date now = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm:ss a HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(now);
        System.out.println(fmtDate);
//        
//        String dateString = "2/22/2011";
//        Date d2 = sdf.parse(dateString);
//        System.out.println(d2);
//        
    }
    
}
