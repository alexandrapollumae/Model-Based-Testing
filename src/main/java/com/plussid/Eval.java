package com.plussid;

public class Eval {
    /**
     * Defineeri meetod eval, mis väärtustab etteantud avaldise.
     * @param str on plussidega eraldatud arvude jada, näiteks "5 + 35+  10".
     * @return arvude summa, antud näide puhul 50.
     */
    public static int eval(String str) {
        int sum = 0;
        int current = 0;
        for (char c : str.toCharArray()) {
            if (c == '+') {
                sum += current;
                current = 0;
            }
            else if (Character.isDigit(c)) {
                current = 10 * current + Character.getNumericValue(c);
            }
        }
        return sum + current;
    }

    public static void main(String[] args) {
        System.out.println(eval("-7-24"));
    }
}
