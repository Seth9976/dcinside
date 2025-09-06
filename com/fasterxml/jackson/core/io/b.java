package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.io.doubleparser.u;
import java.math.BigInteger;

public final class b {
    public static BigInteger a(String s) {
        try {
            return u.a(s);
        }
        catch(NumberFormatException numberFormatException0) {
            if(s.length() > 1000) {
                s = s.substring(0, 1000) + " [truncated]";
            }
            throw new NumberFormatException("Value \"" + s + "\" can not be represented as `java.math.BigInteger`, reason: " + numberFormatException0.getMessage());
        }
    }

    public static BigInteger b(String s, int v) {
        try {
            return u.b(s, v);
        }
        catch(NumberFormatException numberFormatException0) {
            if(s.length() > 1000) {
                s = s.substring(0, 1000) + " [truncated]";
            }
            throw new NumberFormatException("Value \"" + s + "\" can not be represented as `java.math.BigInteger` with radix " + v + ", reason: " + numberFormatException0.getMessage());
        }
    }
}

