package plusminus;

public class Eval {
    /**
     * Defineeri meetod eval, mis väärtustab etteantud avaldise.
     * @param str on plusside või miinustega eraldatud arvude jada, näiteks "5 + 35-  10".
     * @return avaldise väärtus, antud näide puhul 30.
     */
    public static int eval(String str) {
        int sum = 0;
        int current = 0;
        int sign = 1;
        boolean wasDigit = false;
        for (char c : str.toCharArray()) {
            if (c == '+') {
                sum += sign * current;
                current = 0;
                if (wasDigit) sign = 1;
                wasDigit = false;
            } else if (c == '-') {
                sum += sign * current;
                sign *= -1;
                current = 0;
                wasDigit = false;
            }
            else if (Character.isDigit(c)) {
                current = 10 * current + Character.getNumericValue(c);
                wasDigit = true;
            }
        }
        return sum + sign *current;
    }

    public static void main(String[] args) {
        System.out.println(eval("7+24"));
        System.out.println(eval("5 + 35-  10"));
    }
}
