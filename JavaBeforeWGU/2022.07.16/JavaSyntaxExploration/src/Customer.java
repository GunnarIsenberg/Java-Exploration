import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Customer {

    private String firstName;
    private String lastName;
    private boolean hasPaymentInfo;
    private int age;

    public Customer(String firstName, String lastName, boolean hasPaymentInfo,
            Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hasPaymentInfo = hasPaymentInfo;

        Date curTime = new Date();
        this.age = getAge(birthday, curTime);
    }

    // This takes a string and gets the years since the date has passed - there is
    // no exception handling and the
    // expected format is yyyy-mm-dd (1988-09-29).
    private int getAge(Date customerBirthday, Date today) {
        long temporalDiff = customerBirthday.getTime() - today.getTime();
        temporalDiff = (TimeUnit.MILLISECONDS.toDays(temporalDiff) / 365);
        return Math.toIntExact(temporalDiff);
    }
}
