package com.google.firebase.messaging;

import java.util.Locale;

public final class d0 extends Exception {
    private final int a;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;

    d0(String s) {
        super(s);
        this.a = this.b(s);
    }

    public int a() {
        return this.a;
    }

    private int b(String s) {
        if(s == null) {
            return 0;
        }
        String s1 = s.toLowerCase(Locale.US);
        s1.hashCode();
        switch(s1) {
            case "invalid_parameters": {
                return 1;
            }
            case "messagetoobig": {
                return 2;
            }
            case "missing_to": {
                return 1;
            }
            case "service_not_available": {
                return 3;
            }
            case "toomanymessages": {
                return 4;
            }
            default: {
                return 0;
            }
        }
    }
}

