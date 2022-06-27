import org.apache.commons.lang3.StringUtils;
import java.util.*;

public class newClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Something");
        String x = sc.nextLine();
        System.out.println("You Entered");
        System.out.println(x);


        if(StringUtils.isNumeric(x)) {
            System.out.printf("%s is a number", x);

        } else {
            System.out.printf("%s is not a number%n", x);
        }
    }

}
