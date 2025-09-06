package com.tiktok.appevents;

import org.json.JSONObject;

public final class k implements Runnable {
    public final String a;
    public final JSONObject b;
    public final JSONObject c;

    public k(String s, JSONObject jSONObject0, JSONObject jSONObject1) {
        this.a = s;
        this.b = jSONObject0;
        this.c = jSONObject1;
    }

    @Override
    public final void run() {
        p.C(this.a, this.b, this.c);
    }
}

