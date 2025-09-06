package net.fellbaum.jemoji;

import com.fasterxml.jackson.annotation.k;
import java.util.Arrays;
import java.util.List;

public enum M1 {
    COMPONENT("component"),
    FULLY_QUALIFIED("fully-qualified"),
    MINIMALLY_QUALIFIED("minimally-qualified"),
    UNQUALIFIED("unqualified");

    private final String a;
    private static final List f;

    static {
        M1.f = Arrays.asList(((M1[])M1.g.clone()));
    }

    private M1(String s1) {
        this.a = s1;
    }

    @k
    public static M1 a(String s) {
        for(Object object0: M1.f) {
            M1 m10 = (M1)object0;
            if(m10.b().equals(s)) {
                return m10;
            }
            if(false) {
                break;
            }
        }
        throw new IllegalArgumentException("Unknown qualification encountered");
    }

    public String b() {
        return this.a;
    }
}

