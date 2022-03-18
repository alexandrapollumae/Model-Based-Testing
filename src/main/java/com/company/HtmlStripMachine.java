package com.company;
import static com.company.HtmlStripMachine.State.*;

public class HtmlStripMachine {
    enum State {
        INI, TAG, QTE, DQTE
    }
    private State state = INI;

    public String process(char c) {
        boolean echo = state == INI;
        switch (c) {
            case '<':
                if (state == INI) state = TAG;
                return ""; // Seda ei väljastata!
            case '>':
                if (state == TAG) state = INI;
                break;
            case '\'':
                if (state == QTE) state = TAG;
                else if (state == TAG) state = QTE;
                break;
            case '\"':
                if (state == DQTE) state = TAG;
                else if (state == TAG) state = DQTE;
                break;
        }
        return echo ? Character.toString(c) : "";
    }

    // Masina kasutamine
    public static void main(String[] args) {
        String input = "\"<b name='ka>la\"'>foo</b>\"";
        System.out.println(cleanUp(input));
    }

    private static String cleanUp(String s) {
        StringBuilder sb = new StringBuilder();
        HtmlStripMachine machine = new HtmlStripMachine();
        for (char c : s.toCharArray()) sb.append(machine.process(c));
        return sb.toString();
    }
}

