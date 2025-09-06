package com.iab.omid.library.unity3d.adsession;

import A2.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class p extends b {
    private final d a;
    private final c b;
    private final List c;
    private a d;
    private com.iab.omid.library.unity3d.publisher.a e;
    private boolean f;
    private boolean g;
    private final String h;
    private boolean i;
    private boolean j;
    private n k;
    private static final Pattern l;

    static {
        p.l = Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    p(c c0, d d0) {
        this.c = new ArrayList();
        this.f = false;
        this.g = false;
        this.b = c0;
        this.a = d0;
        this.h = "fc2c97f9-1d69-4788-833f-8b9566b5c0c6";
        this.v(null);
        com.iab.omid.library.unity3d.publisher.b b0 = d0.d() == e.b || d0.d() == e.d ? new com.iab.omid.library.unity3d.publisher.b("fc2c97f9-1d69-4788-833f-8b9566b5c0c6", d0.k()) : new com.iab.omid.library.unity3d.publisher.c("fc2c97f9-1d69-4788-833f-8b9566b5c0c6", d0.g(), d0.h());
        this.e = b0;
        this.e.y();
        com.iab.omid.library.unity3d.internal.c.e().b(this);
        this.e.e(c0);
    }

    public boolean A() {
        return this.b.c();
    }

    public boolean B() {
        return this.f;
    }

    void C() {
        this.l();
        this.f().v();
        this.i = true;
    }

    void D() {
        this.r();
        this.f().x();
        this.j = true;
    }

    @Override  // com.iab.omid.library.unity3d.adsession.b
    public void a(View view0, i i0, @Nullable String s) {
        if(this.g) {
            return;
        }
        p.m(view0);
        this.n(s);
        if(this.q(view0) == null) {
            com.iab.omid.library.unity3d.internal.e e0 = new com.iab.omid.library.unity3d.internal.e(view0, i0, s);
            this.c.add(e0);
        }
    }

    @Override  // com.iab.omid.library.unity3d.adsession.b
    public void c(h h0, String s) {
        if(this.g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.d(h0, "Error type is null");
        g.f(s, "Message is null");
        this.f().f(h0, s);
    }

    @Override  // com.iab.omid.library.unity3d.adsession.b
    public void d() {
        if(this.g) {
            return;
        }
        this.d.clear();
        this.h();
        this.g = true;
        this.f().u();
        com.iab.omid.library.unity3d.internal.c.e().d(this);
        this.f().p();
        this.e = null;
        this.k = null;
    }

    @Override  // com.iab.omid.library.unity3d.adsession.b
    public String e() {
        return this.h;
    }

    @Override  // com.iab.omid.library.unity3d.adsession.b
    public com.iab.omid.library.unity3d.publisher.a f() {
        return this.e;
    }

    @Override  // com.iab.omid.library.unity3d.adsession.b
    public void g(View view0) {
        if(this.g) {
            return;
        }
        g.d(view0, "AdView is null");
        if(this.s() == view0) {
            return;
        }
        this.v(view0);
        this.f().a();
        this.t(view0);
    }

    @Override  // com.iab.omid.library.unity3d.adsession.b
    public void h() {
        if(this.g) {
            return;
        }
        this.c.clear();
    }

    @Override  // com.iab.omid.library.unity3d.adsession.b
    public void i(View view0) {
        if(this.g) {
            return;
        }
        p.m(view0);
        com.iab.omid.library.unity3d.internal.e e0 = this.q(view0);
        if(e0 != null) {
            this.c.remove(e0);
        }
    }

    @Override  // com.iab.omid.library.unity3d.adsession.b
    public void j(n n0) {
        this.k = n0;
    }

    @Override  // com.iab.omid.library.unity3d.adsession.b
    public void k() {
        if(this.f) {
            return;
        }
        this.f = true;
        com.iab.omid.library.unity3d.internal.c.e().f(this);
        float f = com.iab.omid.library.unity3d.internal.h.d().c();
        this.e.b(f);
        this.e.m(com.iab.omid.library.unity3d.internal.a.a().c());
        this.e.g(this, this.a);
    }

    private void l() {
        if(this.i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private static void m(View view0) {
        if(view0 == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void n(String s) {
        if(s != null) {
            if(s.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if(!p.l.matcher(s).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    public void o(List list0) {
        if(this.w()) {
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

    void p(@NonNull JSONObject jSONObject0) {
        this.r();
        this.f().n(jSONObject0);
        this.j = true;
    }

    private com.iab.omid.library.unity3d.internal.e q(View view0) {
        for(Object object0: this.c) {
            com.iab.omid.library.unity3d.internal.e e0 = (com.iab.omid.library.unity3d.internal.e)object0;
            if(e0.c().get() == view0) {
                return e0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    private void r() {
        if(this.j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public View s() {
        return (View)this.d.get();
    }

    private void t(View view0) {
        Collection collection0 = com.iab.omid.library.unity3d.internal.c.e().c();
        if(collection0 != null && !collection0.isEmpty()) {
            for(Object object0: collection0) {
                p p0 = (p)object0;
                if(p0 != this && p0.s() == view0) {
                    p0.d.clear();
                }
            }
        }
    }

    public List u() {
        return this.c;
    }

    private void v(View view0) {
        this.d = new a(view0);
    }

    public boolean w() {
        return this.k != null;
    }

    // 去混淆评级： 低(20)
    public boolean x() {
        return this.f && !this.g;
    }

    public boolean y() {
        return this.g;
    }

    public boolean z() {
        return this.b.b();
    }
}

