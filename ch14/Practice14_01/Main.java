import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(now);
        int day = c.get(Calendar.DAY_OF_MONTH);
        c.set(Calendar.DAY_OF_MONTH, day + 100);
        Date newDate = c.getTime();
        // SimpleDateFormat f = new SimpleDateFormat("西暦" + "yyyy" + "年" + "MM" + "月" + "dd" + "日");
        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日"); // 正解はこっち
        String s = f.format(newDate);
        System.out.println(s);
    }
}