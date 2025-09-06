package com.iab.omid.library.unity3d.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.unity3d.walking.async.b.b;
import com.iab.omid.library.unity3d.walking.async.d;
import com.iab.omid.library.unity3d.walking.async.e;
import com.iab.omid.library.unity3d.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

public class c implements b {
    private JSONObject a;
    private final com.iab.omid.library.unity3d.walking.async.c b;

    public c(com.iab.omid.library.unity3d.walking.async.c c0) {
        this.b = c0;
    }

    @Override  // com.iab.omid.library.unity3d.walking.async.b$b
    @VisibleForTesting
    public JSONObject a() {
        return this.a;
    }

    @Override  // com.iab.omid.library.unity3d.walking.async.b$b
    @VisibleForTesting
    public void a(JSONObject jSONObject0) {
        this.a = jSONObject0;
    }

    public void b(JSONObject jSONObject0, HashSet hashSet0, long v) {
        e e0 = new e(this, hashSet0, jSONObject0, v);
        this.b.c(e0);
    }

    public void c() {
        d d0 = new d(this);
        this.b.c(d0);
    }

    public void d(JSONObject jSONObject0, HashSet hashSet0, long v) {
        f f0 = new f(this, hashSet0, jSONObject0, v);
        this.b.c(f0);
    }
}

