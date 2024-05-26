package practicejava;

import java.util.Stack;

public class RemoveStars {
    public static void main(String[] args) {
        StringBuilder c = new StringBuilder();
        String s = "leet**cod*e";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                c.deleteCharAt(c.length() - 1);
            } else {
                c.append(s.charAt(i));
            }
        }
        System.out.println(c.toString());
    }
}
