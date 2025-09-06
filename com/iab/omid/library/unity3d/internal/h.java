package com.iab.omid.library.unity3d.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.unity3d.adsession.p;
import z2.b;
import z2.c;
import z2.d;
import z2.e;

public class h implements a, c {
    private float a;
    private final e b;
    private final b c;
    private d d;
    private com.iab.omid.library.unity3d.internal.c e;
    private static h f;

    public h(e e0, b b0) {
        this.a = 0.0f;
        this.b = e0;
        this.c = b0;
    }

    private com.iab.omid.library.unity3d.internal.c a() {
        if(this.e == null) {
            this.e = com.iab.omid.library.unity3d.internal.c.e();
        }
        return this.e;
    }

    @Override  // z2.c
    public void a(float f) {
        this.a = f;
        for(Object object0: this.a().a()) {
            ((p)object0).f().b(f);
        }
    }

    @Override  // com.iab.omid.library.unity3d.internal.d$a
    public void a(boolean z) {
        if(z) {
            com.iab.omid.library.unity3d.walking.a.q().r();
            return;
        }
        com.iab.omid.library.unity3d.walking.a.q().p();
    }

    public void b(Context context0) {
        z2.a a0 = this.c.a();
        Handler handler0 = new Handler();
        this.d = this.b.a(handler0, context0, a0, this);
    }

    public float c() {
        return this.a;
    }

    public static h d() {
        if(h.f == null) {
            b b0 = new b();
            h.f = new h(new e(), b0);
        }
        return h.f;
    }

    public void e() {
        com.iab.omid.library.unity3d.internal.b.k().b(this);
        com.iab.omid.library.unity3d.internal.b.k().i();
        com.iab.omid.library.unity3d.walking.a.q().r();
        this.d.d();
    }

    public void f() {
        com.iab.omid.library.unity3d.walking.a.q().t();
        com.iab.omid.library.unity3d.internal.b.k().j();
        this.d.e();
    }
}

