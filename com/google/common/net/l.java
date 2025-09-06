package com.google.common.net;

import J1.b;
import com.google.common.escape.h;

@b
@a
public final class l {
    static final String a = "-_.*";
    static final String b = "-._~!$\'()*,;&=@:";
    private static final h c;
    private static final h d;
    private static final h e;

    static {
        l.c = new k("-_.*", true);
        l.d = new k("-._~!$\'()*,;&=@:+", false);
        l.e = new k("-._~!$\'()*,;&=@:+/?", false);
    }

    public static h a() {
        return l.c;
    }

    public static h b() {
        return l.e;
    }

    public static h c() {
        return l.d;
    }
}

