package Stacks;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {

        // Create Two Stacks For Storing Differnt Parameters -
        Stack<Integer> isNum = new Stack<>();
        Stack<String> isChar = new Stack<>();
        int k = 0;

        for (char c : s.toCharArray()) {

            // After Converting into Array if the String has Digit Push into Stack -
            if (Character.isDigit(c)) {
                k = (k * 10) + (c - '0');
                continue;
            }

            if (c == '[') {
                isNum.push(k);
                k = 0;
                isChar.push(String.valueOf(c));
                continue;
            }

            if (c != ']') {
                isChar.push(String.valueOf(c));
                continue;
            }

            StringBuilder sb = new StringBuilder();
            while (!isChar.peek().equals("["))
                sb.insert(0, isChar.pop());

            isChar.pop();

            StringBuilder sb1 = new StringBuilder();
            int count = isNum.pop();
            for (int i = 0; i < count; i++) {
                sb1.append(sb);
            }
            isChar.push(sb1.toString());
        }
        StringBuilder result = new StringBuilder();
        while (!isChar.empty()) {
            result.insert(0, isChar.pop());
        }
        return result.toString();
    }
}
