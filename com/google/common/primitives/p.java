package com.google.common.primitives;

import J1.b;

@b
@f
final class p {
    final String a;
    final int b;

    private p(String s, int v) {
        this.a = s;
        this.b = v;
    }

    static p a(String s) {
        if(s.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        int v = s.charAt(0);
        if(!s.startsWith("0x") && !s.startsWith("0X")) {
            switch(v) {
                case 35: {
                    return new p(s.substring(1), 16);
                }
                case 0x30: {
                    return s.length() <= 1 ? new p(s, 10) : new p(s.substring(1), 8);
                }
                default: {
                    return new p(s, 10);
                }
            }
        }
        return new p(s.substring(2), 16);
    }
}

