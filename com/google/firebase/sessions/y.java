package com.google.firebase.sessions;

import android.util.Base64;
import kotlin.text.v;
import y4.l;

public final class y {
    @l
    public static final y a;
    private static final String b;
    @l
    private static final String c;
    @l
    private static final String d;

    static {
        y.a = new y();
        String s = Base64.encodeToString(v.J1(w.a.e()), 10);
        y.b = s;
        y.c = "firebase_session_" + s + "_data";
        y.d = "firebase_session_" + s + "_settings";
    }

    @l
    public final String a() {
        return y.c;
    }

    @l
    public final String b() {
        return y.d;
    }
}

