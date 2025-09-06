package com.fsn.cauly.Y;

import android.app.KeyguardManager;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.fsn.cauly.blackdragoncore.utils.e;
import java.lang.ref.WeakReference;

public class z extends RelativeLayout implements b, a, com.fsn.cauly.Y.s0.a {
    public interface com.fsn.cauly.Y.z.a {
        void a();

        void b();
    }

    j0 a;
    d0 b;
    View c;
    String d;
    i0 e;
    boolean f;
    WeakReference g;
    boolean h;
    t0 i;
    boolean j;
    boolean k;
    o0 l;
    boolean m;

    public z(Context context0) {
        super(context0);
        this.k = true;
    }

    @Override  // com.fsn.cauly.Y.d0$b
    public void a() {
        if(!this.m) {
            this.e();
        }
    }

    public void a(i0 i00, j0 j00) {
        this.e = i00;
        this.a = j00;
        d0 d00 = new d0();
        this.b = d00;
        if(!d00.a(this.getContext().getApplicationContext(), this)) {
            this.b = null;
        }
    }

    @Override  // com.fsn.cauly.Y.n0$a
    public void a(n0 n00, boolean z) {
        d0 d00 = this.b;
        if(d00 != null) {
            d00.b(this.c, "onMovieFinished", null);
        }
    }

    @Override  // com.fsn.cauly.Y.s0$a
    public void a(s0 s00) {
        this.d();
    }

    @Override  // com.fsn.cauly.Y.d0$b
    public void a(String s) {
        this.d = s;
        this.h();
    }

    @Override  // com.fsn.cauly.Y.d0$b
    public void b() {
        this.removeAllViews();
        this.f();
    }

    @Override  // com.fsn.cauly.Y.d0$b
    public void c() {
        if(this.m) {
            this.e();
            return;
        }
        this.g();
    }

    void d() {
        if(this.f) {
            return;
        }
        t0 t00 = this.i;
        if(t00 != null) {
            t00.cancel();
            this.i = null;
        }
        boolean z = ((KeyguardManager)this.e.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        boolean z1 = !this.k || z;
        if(this.j != z1) {
            this.j = z1;
            d0 d00 = this.b;
            if(d00 != null) {
                if(z1) {
                    d00.a(this.c);
                }
                else {
                    d00.b(this.c);
                }
            }
        }
        t0 t01 = new t0(50);
        this.i = t01;
        t01.a(this);
        this.i.execute();
    }

    void e() {
        if(this.h) {
            return;
        }
        this.h = true;
        WeakReference weakReference0 = this.g;
        if(weakReference0 == null) {
            return;
        }
        com.fsn.cauly.Y.z.a z$a0 = (com.fsn.cauly.Y.z.a)weakReference0.get();
        if(z$a0 == null) {
            return;
        }
        z$a0.a();
    }

    void f() {
        WeakReference weakReference0 = this.g;
        if(weakReference0 == null) {
            return;
        }
        com.fsn.cauly.Y.z.a z$a0 = (com.fsn.cauly.Y.z.a)weakReference0.get();
        if(z$a0 == null) {
            return;
        }
        z$a0.b();
    }

    public void g() {
        View view0 = this.b.a();
        this.c = view0;
        view0.setBackgroundColor(0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -1);
        this.c.setLayoutParams(relativeLayout$LayoutParams0);
        this.addView(this.c);
        this.b.a(this.c, ("popup_3d".equals(this.a.f) ? this.a.h : this.a.e), null);
        this.b.b(this.c, "setLogTrackerUrl", "http://logtracker.cauly.co.kr:13000/log3d?");
        this.b.b(this.c, "setAdCd", this.a.a);
        this.b.b(this.c, "setAppCode", this.e.f);
        this.b.b(this.c, "setContentsOption", "showCloseButton");
        this.b.b(this.c, "setIserial", this.a.n);
        String s = this.a.y;
        if(s != null && s.length() > 0) {
            String s1 = m0.d(this.e.b);
            String s2 = m0.a(this.a.y, s1);
            if(e.b(s2)) {
                this.b.b(this.c, "setAdLogo", s2);
            }
        }
        t0 t00 = new t0(50);
        this.i = t00;
        t00.a(this);
        this.i.execute();
    }

    void h() {
        o0 o00 = new o0(this.e.b);
        this.l = o00;
        o00.a(this);
        this.l.a(this.e, this.d);
    }

    public void i() {
        this.f = true;
        t0 t00 = this.i;
        if(t00 != null) {
            t00.cancel();
            this.i = null;
        }
        d0 d00 = this.b;
        if(d00 != null) {
            d00.d();
            this.b = null;
        }
        this.removeAllViews();
    }

    @Override  // android.view.View
    protected void onWindowVisibilityChanged(int v) {
        this.k = v == 0;
        super.onWindowVisibilityChanged(v);
        if(this.c != null) {
            this.d();
        }
    }

    public void setListener(com.fsn.cauly.Y.z.a z$a0) {
        this.g = new WeakReference(z$a0);
    }

    public void setPauseOnStart(boolean z) {
        this.m = z;
    }
}

