package Taller_8;

import java.util.Stack;

public class CalcPolaca {


    public static int polaca(String string) {
        String[] s = string.split(" ");
        Stack<String> oper = new Stack<>();
        Stack<String> arit = new Stack<>();
        for (int i = s.length - 1; i >= 0; i--) {
            if (s[i].equals("+") || s[i].equals("-") || s[i].equals("*") || s[i].equals("/")) {
                arit.push(s[i]);
            } else {
                oper.push(s[i]);
            }
        }
        int aux = Integer.parseInt(oper.pop());
        while (!arit.empty()) {
            switch (arit.pop()) {
                case "+":
                    aux += Integer.parseInt(oper.pop());
                    break;
                case "-":
                    aux -= Integer.parseInt(oper.pop());
                    break;
                case "*":
                    aux *= Integer.parseInt(oper.pop());
                    break;
                case "/":
                    aux /= Integer.parseInt(oper.pop());
                    break;
            }
        }
        return aux;
    }


}
