import java.util.Scanner;

public class HW_2_2 {

    public static void main(String[] args) {
        String inputStr = "6 10 15 20 25";
        Scanner keyboard = new Scanner(inputStr);

        for (int i = 0; i < 5; i++) {
            int number = keyboard.nextInt();
            int n;
            for (n = 1; n * (n + 1) / 2 < number; n++) {
            }
            if (n * (n + 1) / 2 == number) {
                System.out.println(number + " YES");
            } else {
                System.out.println(number + " NO");
            }
        }
    }
  
}
