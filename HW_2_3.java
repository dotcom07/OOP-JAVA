import java.util.Scanner;

public class HW_2_3 {

    public static void main(String[] args) {

        String inputStr = "2000 FEB 1900 FEB 2020 FEB 2021 FEB 2016 MAR 2019 NOV 2100 FEB 2400 FEB 1996 APR 2004 OCT";
        Scanner scanner = new Scanner(inputStr);


        for (int i = 0; i < 10; i++) {
            int year = scanner.nextInt();
            String month = scanner.next();
            int days = 0;


            boolean LY = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

            switch (month) {

                case "JAN": case "MAR": case "MAY": case "JUL":
                case "AUG": case "OCT": case "DEC":
                    days = 31;
                    break;


                case "APR": case "JUN": case "SEP": case "NOV":
                    days = 30;
                    break;


                case "FEB":
                    if (LY) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;

                default:
                    System.out.println("틀린 입력");
                    break;
            }
            System.out.println(year + " " + month + ": " + days);
        }
    }
  
}
