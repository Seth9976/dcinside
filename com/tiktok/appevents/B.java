package com.tiktok.appevents;

import org.json.JSONObject;

public final class b implements Runnable {
    public final p a;
    public final String b;
    public final JSONObject c;
    public final a d;
    public final String e;

    public b(p p0, String s, JSONObject jSONObject0, a a$a0, String s1) {
        this.a = p0;
        this.b = s;
        this.c = jSONObject0;
        this.d = a$a0;
        this.e = s1;
    }

    @Override
    public final void run() {
        this.a.F(this.b, this.c, this.d, this.e);
    }
}

