import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String N[] = {"Faisal", "Ali", "Saad"};
        System.out.println(Arrays.toString(N));

        for (int i = 0; i < 31; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);

            for (int j = 0; j < 20; j++) {
                if (i % 5 == 0 ) {
                    continue;
                }
            }
        }
    }
}
        





