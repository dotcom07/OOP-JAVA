
public class HW_3_1 {

    public static void main(String[] args) {
        String[] inputs = {
                "({[]})(){}[]",   // balanced
                "((()))",         // balanced
                "{[]}()",         // balanced
                "({[}])",         // unbalanced
                "(((",            // unbalanced
                ")))",            // unbalanced
                "([]{})",         // balanced
                "([)]",           // unbalanced
                "{",              // unbalanced
                ""                // balanced
        };



        for (int i = 0; i < inputs.length; i++) {
            String all_b = inputs[i];
            boolean T = false;
            char[] stack = new char[12];
            int top=-1;
            if (all_b.length()==0) {
                T = true;
            } else {
                for (int j = 0; j < all_b.length(); j++) {
                    char com_b = inputs[i].charAt(j);
                    if (com_b == '(' || com_b == '{' || com_b == '[') {
                        top++;
                        stack[top] = com_b;
                    } else if (com_b == ')' || com_b == '}' || com_b == ']') {
                        if (top == -1) {
                            T = false;
                            break;
                        } else {
                            char pop_b = stack[top];

                            if ( ((pop_b == '(') && (com_b == ')'))
                                || ((pop_b == '{') && (com_b == '}'))
                                    || ((pop_b == '[') && (com_b == ']')) ){
                                stack[top] = '0';
                                top--;
                                T = true;
                            } else {
                                T = false;
                                break;
                            }
                        }
                    }

                }
            }
            if (T==true) {
                System.out.println("input: \""+all_b+"\" balanced");
            }
            else {
                System.out.println("input: \""+all_b+"\" unbalanced");
            }
        }
    }
  
}
