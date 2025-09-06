package com.google.common.xml;

import J1.b;
import com.google.common.escape.h;
import com.google.common.escape.i;

@b
@a
public class c {
    private static final char a = '\u0000';
    private static final char b = '\u001F';
    private static final h c;
    private static final h d;
    private static final h e;

    static {
        com.google.common.escape.i.c i$c0 = i.b();
        i$c0.d('\u0000', '\uFFFD');
        i$c0.e("\uFFFD");
        for(int v = 0; v <= 0x1F; v = (char)(v + 1)) {
            if(v != 9 && v != 10 && v != 13) {
                i$c0.b(((char)v), "\uFFFD");
            }
        }
        i$c0.b('&', "&amp;");
        i$c0.b('<', "&lt;");
        i$c0.b('>', "&gt;");
        c.d = i$c0.c();
        i$c0.b('\'', "&apos;");
        i$c0.b('\"', "&quot;");
        c.c = i$c0.c();
        i$c0.b('\t', "&#x9;");
        i$c0.b('\n', "&#xA;");
        i$c0.b('\r', "&#xD;");
        c.e = i$c0.c();
    }

    public static h a() {
        return c.e;
    }

    public static h b() {
        return c.d;
    }
}

