package com.iab.omid.library.vungle.adsession;

import C2.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.vungle.internal.f;
import com.iab.omid.library.vungle.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

public class q extends b {
    private final d a;
    private final c b;
    private final f c;
    private a d;
    private com.iab.omid.library.vungle.publisher.a e;
    private boolean f;
    private boolean g;
    private final String h;
    private boolean i;
    private boolean j;
    private o k;

    q(c c0, d d0) {
        this(c0, d0, "acf6c284-3dee-4763-a85c-366b0b201d9a");
    }

    q(c c0, d d0, String s) {
        this.c = new f();
        this.f = false;
        this.g = false;
        this.b = c0;
        this.a = d0;
        this.h = s;
        this.q(null);
        com.iab.omid.library.vungle.publisher.b b0 = d0.d() == e.b || d0.d() == e.d ? new com.iab.omid.library.vungle.publisher.b(s, d0.k()) : new com.iab.omid.library.vungle.publisher.c(s, d0.g(), d0.h());
        this.e = b0;
        this.e.z();
        com.iab.omid.library.vungle.internal.c.e().b(this);
        this.e.e(c0);
    }

    void A() {
        this.p();
        this.f().y();
        this.j = true;
    }

    @Override  // com.iab.omid.library.vungle.adsession.b
    public void a(View view0, i i0, @Nullable String s) {
        if(this.g) {
            return;
        }
        this.c.c(view0, i0, s);
    }

    @Override  // com.iab.omid.library.vungle.adsession.b
    public void c(h h0, String s) {
        if(this.g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.d(h0, "Error type is null");
        g.f(s, "Message is null");
        this.f().f(h0, s);
    }

    @Override  // com.iab.omid.library.vungle.adsession.b
    public void d() {
        if(this.g) {
            return;
        }
        this.d.clear();
        this.h();
        this.g = true;
        this.f().v();
        com.iab.omid.library.vungle.internal.c.e().d(this);
        this.f().p();
        this.e = null;
        this.k = null;
    }

    @Override  // com.iab.omid.library.vungle.adsession.b
    public String e() {
        return this.h;
    }

    @Override  // com.iab.omid.library.vungle.adsession.b
    public com.iab.omid.library.vungle.publisher.a f() {
        return this.e;
    }

    @Override  // com.iab.omid.library.vungle.adsession.b
    public void g(@Nullable View view0) {
        if(this.g) {
            return;
        }
        if(this.r() == view0) {
            return;
        }
        this.q(view0);
        this.f().a();
        this.m(view0);
    }

    @Override  // com.iab.omid.library.vungle.adsession.b
    public void h() {
        if(this.g) {
            return;
        }
        this.c.f();
    }

    @Override  // com.iab.omid.library.vungle.adsession.b
    public void i(View view0) {
        if(this.g) {
            return;
        }
        this.c.g(view0);
    }

    @Override  // com.iab.omid.library.vungle.adsession.b
    public void j(o o0) {
        this.k = o0;
    }

    @Override  // com.iab.omid.library.vungle.adsession.b
    public void k() {
        if(!this.f && this.e != null) {
            this.f = true;
            com.iab.omid.library.vungle.internal.c.e().f(this);
            float f = com.iab.omid.library.vungle.internal.i.d().c();
            this.e.b(f);
            this.e.m(com.iab.omid.library.vungle.internal.a.a().c());
            this.e.g(this, this.a);
        }
    }

    private void l() {
        if(this.i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void m(@Nullable View view0) {
        Collection collection0 = com.iab.omid.library.vungle.internal.c.e().c();
        if(collection0 != null && !collection0.isEmpty()) {
            for(Object object0: collection0) {
                q q0 = (q)object0;
                if(q0 != this && q0.r() == view0) {
                    q0.d.clear();
                }
            }
        }
    }

    public void n(List list0) {
        if(this.t()) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                View view0 = (View)((a)object0).get();
                if(view0 != null) {
                    arrayList0.add(view0);
                }
            }
            this.k.onPossibleObstructionsDetected(this.h, arrayList0);
        }
    }

    void o(@NonNull JSONObject jSONObject0) {
        this.p();
        this.f().n(jSONObject0);
        this.j = true;
    }

    private void p() {
        if(this.j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void q(@Nullable View view0) {
        this.d = new a(view0);
    }

    public View r() {
        return (View)this.d.get();
    }

    public List s() {
        return this.c.a();
    }

    public boolean t() {
        return this.k != null;
    }

    // 去混淆评级： 低(20)
    public boolean u() {
        return this.f && !this.g;
    }

    public boolean v() {
        return this.g;
    }

    public boolean w() {
        return this.b.b();
    }

    public boolean x() {
        return this.b.c();
    }

    public boolean y() {
        return this.f;
    }

    void z() {
        this.l();
        this.f().w();
        this.i = true;
    }
}

