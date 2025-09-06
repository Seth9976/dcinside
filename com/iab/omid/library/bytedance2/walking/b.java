package com.iab.omid.library.bytedance2.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bytedance2.walking.async.c;
import com.iab.omid.library.bytedance2.walking.async.d;
import com.iab.omid.library.bytedance2.walking.async.e;
import com.iab.omid.library.bytedance2.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

public class b implements com.iab.omid.library.bytedance2.walking.async.b.b {
    private JSONObject a;
    private final c b;

    public b(c c0) {
        this.b = c0;
    }

    @Override  // com.iab.omid.library.bytedance2.walking.async.b$b
    @VisibleForTesting
    public JSONObject a() {
        return this.a;
    }

    @Override  // com.iab.omid.library.bytedance2.walking.async.b$b
    @VisibleForTesting
    public void a(JSONObject jSONObject0) {
        this.a = jSONObject0;
    }

    public void a(JSONObject jSONObject0, HashSet hashSet0, long v) {
        e e0 = new e(this, hashSet0, jSONObject0, v);
        this.b.b(e0);
    }

    public void b() {
        d d0 = new d(this);
        this.b.b(d0);
    }

    public void b(JSONObject jSONObject0, HashSet hashSet0, long v) {
        f f0 = new f(this, hashSet0, jSONObject0, v);
        this.b.b(f0);
    }
}

