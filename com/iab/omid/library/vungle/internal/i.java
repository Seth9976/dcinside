package com.iab.omid.library.vungle.internal;

import B2.b;
import B2.c;
import B2.d;
import B2.e;
import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.vungle.adsession.q;

public class i implements c, a {
    private float a;
    private final e b;
    private final b c;
    private d d;
    private com.iab.omid.library.vungle.internal.c e;
    private static i f;

    public i(e e0, b b0) {
        this.a = 0.0f;
        this.b = e0;
        this.c = b0;
    }

    private com.iab.omid.library.vungle.internal.c a() {
        if(this.e == null) {
            this.e = com.iab.omid.library.vungle.internal.c.e();
        }
        return this.e;
    }

    @Override  // B2.c
    public void a(float f) {
        this.a = f;
        for(Object object0: this.a().a()) {
            ((q)object0).f().b(f);
        }
    }

    @Override  // com.iab.omid.library.vungle.internal.d$a
    public void a(boolean z) {
        if(z) {
            com.iab.omid.library.vungle.walking.a.q().r();
            return;
        }
        com.iab.omid.library.vungle.walking.a.q().p();
    }

    public void b(Context context0) {
        B2.a a0 = this.c.a();
        Handler handler0 = new Handler();
        this.d = this.b.a(handler0, context0, a0, this);
    }

    public float c() {
        return this.a;
    }

    public static i d() {
        if(i.f == null) {
            b b0 = new b();
            i.f = new i(new e(), b0);
        }
        return i.f;
    }

    public void e() {
        com.iab.omid.library.vungle.internal.b.k().b(this);
        com.iab.omid.library.vungle.internal.b.k().i();
        com.iab.omid.library.vungle.walking.a.q().r();
        this.d.d();
    }

    public void f() {
        com.iab.omid.library.vungle.walking.a.q().t();
        com.iab.omid.library.vungle.internal.b.k().j();
        this.d.e();
    }
}

