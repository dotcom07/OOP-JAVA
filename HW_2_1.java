public class HW_2_1 {

    public static void main(String[] args) {
        String inputStr = "Hello, World! This is a Test.";
        String ab = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < ab.length(); i++) {
            char which_ab = ab.charAt(i);
            for (int j = 0; j < inputStr.length(); j++) {
                char which_str = Character.toLowerCase(inputStr.charAt(j));
                if (which_str == which_ab) {
                    System.out.println(which_ab + " : " + j);
                    break;
                }
            }

        }

    }
  
}
