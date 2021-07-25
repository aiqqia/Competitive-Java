import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar.*;

public class datestuff{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strDate = sc.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date datee = new Date();
        try{
            datee = formatter.parse(strDate);
        } catch(ParseException e){
            e.printStackTrace();
        }
        //datee = DateUtils.addMinutes(datee, 10);
        //datee = datee.plus(Duration.of(10, ChronoUnit.MINUTES));
        Calendar cal = Calendar.getInstance();
        cal.setTime(datee);
        //Calendar date = Calendar.getInstance();
        System.out.println("Current Date and TIme : " + cal.getTime());
        long timeInSecs = cal.getTimeInMillis();
        datee = new Date(timeInSecs + (10 * 60 * 1000));
        System.out.println("After adding 10 mins : " + datee);
        // Date dated = new Date(datee + (10));
        //System.out.println(datee);
        //demo of date
    }
}