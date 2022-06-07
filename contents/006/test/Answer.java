import java.util.TimeZone;

public class Answer {
    public static void main(String[] args) {
        TimeZone tz = TimeZone.getDefault();
        System.out.println(tz.getID());
    }
}
