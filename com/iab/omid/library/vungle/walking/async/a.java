package com.iab.omid.library.vungle.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

public abstract class a extends b {
    protected final HashSet c;
    protected final JSONObject d;
    protected final long e;

    public a(com.iab.omid.library.vungle.walking.async.b.b b$b0, HashSet hashSet0, JSONObject jSONObject0, long v) {
        super(b$b0);
        this.c = new HashSet(hashSet0);
        this.d = jSONObject0;
        this.e = v;
    }
}

