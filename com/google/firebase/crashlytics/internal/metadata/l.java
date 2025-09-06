package com.google.firebase.crashlytics.internal.metadata;

import java.util.List;
import java.util.Map;

public final class l implements Runnable {
    public final o a;
    public final String b;
    public final Map c;
    public final List d;

    public l(o o0, String s, Map map0, List list0) {
        this.a = o0;
        this.b = s;
        this.c = map0;
        this.d = list0;
    }

    @Override
    public final void run() {
        this.a.k(this.b, this.c, this.d);
    }
}

