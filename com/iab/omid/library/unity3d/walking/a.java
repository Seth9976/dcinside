package com.iab.omid.library.unity3d.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.unity3d.adsession.p;
import com.iab.omid.library.unity3d.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class a implements com.iab.omid.library.unity3d.processor.a.a {
    public interface com.iab.omid.library.unity3d.walking.a.a extends b {
        void onTreeProcessedNano(int arg1, long arg2);
    }

    public interface b {
        void onTreeProcessed(int arg1, long arg2);
    }

    class d implements Runnable {
        d() {
            super();
        }

        @Override
        public void run() {
            a.q().v();
        }
    }

    class e implements Runnable {
        e() {
            super();
        }

        @Override
        public void run() {
            if(a.k != null) {
                a.k.post(a.l);
                a.k.postDelayed(a.m, 200L);
            }
        }
    }

    private List a;
    private int b;
    private boolean c;
    private final List d;
    private com.iab.omid.library.unity3d.processor.b e;
    private com.iab.omid.library.unity3d.walking.b f;
    private c g;
    private long h;
    private static a i;
    private static Handler j;
    private static Handler k;
    private static final Runnable l;
    private static final Runnable m;

    static {
        a.i = new a();
        a.j = new Handler(Looper.getMainLooper());
        a.k = null;
        a.l = new d();
        a.m = new e();
    }

    a() {
        this.a = new ArrayList();
        this.c = false;
        this.d = new ArrayList();
        this.f = new com.iab.omid.library.unity3d.walking.b();
        this.e = new com.iab.omid.library.unity3d.processor.b();
        this.g = new c(new com.iab.omid.library.unity3d.walking.async.c());
    }

    @Override  // com.iab.omid.library.unity3d.processor.a$a
    public void a(View view0, com.iab.omid.library.unity3d.processor.a a0, JSONObject jSONObject0, boolean z) {
        if(!h.d(view0)) {
            return;
        }
        com.iab.omid.library.unity3d.walking.d d0 = this.f.m(view0);
        if(d0 == com.iab.omid.library.unity3d.walking.d.c) {
            return;
        }
        JSONObject jSONObject1 = a0.a(view0);
        com.iab.omid.library.unity3d.utils.c.j(jSONObject0, jSONObject1);
        if(!this.k(view0, jSONObject1)) {
            boolean z1 = z || this.g(view0, jSONObject1);
            if(this.c && d0 == com.iab.omid.library.unity3d.walking.d.b && !z1) {
                A2.a a1 = new A2.a(view0);
                this.d.add(a1);
            }
            this.e(view0, a0, jSONObject1, d0, z1);
        }
        ++this.b;
    }

    private void d(long v) {
        if(this.a.size() > 0) {
            for(Object object0: this.a) {
                b a$b0 = (b)object0;
                a$b0.onTreeProcessed(this.b, TimeUnit.NANOSECONDS.toMillis(v));
                if(a$b0 instanceof com.iab.omid.library.unity3d.walking.a.a) {
                    ((com.iab.omid.library.unity3d.walking.a.a)a$b0).onTreeProcessedNano(this.b, v);
                }
            }
        }
    }

    private void e(View view0, com.iab.omid.library.unity3d.processor.a a0, JSONObject jSONObject0, com.iab.omid.library.unity3d.walking.d d0, boolean z) {
        a0.a(view0, jSONObject0, this, d0 == com.iab.omid.library.unity3d.walking.d.a, z);
    }

    private void f(String s, View view0, JSONObject jSONObject0) {
        com.iab.omid.library.unity3d.processor.a a0 = this.e.b();
        String s1 = this.f.g(s);
        if(s1 != null) {
            JSONObject jSONObject1 = a0.a(view0);
            com.iab.omid.library.unity3d.utils.c.h(jSONObject1, s);
            com.iab.omid.library.unity3d.utils.c.n(jSONObject1, s1);
            com.iab.omid.library.unity3d.utils.c.j(jSONObject0, jSONObject1);
        }
    }

    private boolean g(View view0, JSONObject jSONObject0) {
        com.iab.omid.library.unity3d.walking.b.a b$a0 = this.f.i(view0);
        if(b$a0 != null) {
            com.iab.omid.library.unity3d.utils.c.f(jSONObject0, b$a0);
            return true;
        }
        return false;
    }

    public void h(b a$b0) {
        if(!this.a.contains(a$b0)) {
            this.a.add(a$b0);
        }
    }

    private boolean k(View view0, JSONObject jSONObject0) {
        String s = this.f.k(view0);
        if(s != null) {
            com.iab.omid.library.unity3d.utils.c.h(jSONObject0, s);
            com.iab.omid.library.unity3d.utils.c.g(jSONObject0, Boolean.valueOf(this.f.o(view0)));
            this.f.l();
            return true;
        }
        return false;
    }

    private void m() {
        this.d(9375485848600L - this.h);
    }

    private void n() {
        this.b = 0;
        this.d.clear();
        this.c = false;
        for(Object object0: com.iab.omid.library.unity3d.internal.c.e().a()) {
            if(((p)object0).w()) {
                this.c = true;
                break;
            }
            if(false) {
                break;
            }
        }
        this.h = 9375487915100L;
    }

    @VisibleForTesting
    void o() {
        this.f.n();
        com.iab.omid.library.unity3d.processor.a a0 = this.e.a();
        if(this.f.h().size() > 0) {
            for(Object object0: this.f.h()) {
                JSONObject jSONObject0 = a0.a(null);
                this.f(((String)object0), this.f.a(((String)object0)), jSONObject0);
                com.iab.omid.library.unity3d.utils.c.m(jSONObject0);
                HashSet hashSet0 = new HashSet();
                hashSet0.add(((String)object0));
                this.g.b(jSONObject0, hashSet0, 9375581633200L);
            }
        }
        if(this.f.j().size() > 0) {
            JSONObject jSONObject1 = a0.a(null);
            this.e(null, a0, jSONObject1, com.iab.omid.library.unity3d.walking.d.a, false);
            com.iab.omid.library.unity3d.utils.c.m(jSONObject1);
            this.g.d(jSONObject1, this.f.j(), 9375581633200L);
            if(this.c) {
                for(Object object1: com.iab.omid.library.unity3d.internal.c.e().a()) {
                    ((p)object1).o(this.d);
                }
            }
        }
        else {
            this.g.c();
        }
        this.f.c();
    }

    public void p() {
        this.u();
    }

    public static a q() {
        return a.i;
    }

    public void r() {
        this.s();
    }

    private void s() {
        if(a.k == null) {
            Handler handler0 = new Handler(Looper.getMainLooper());
            a.k = handler0;
            handler0.post(a.l);
            a.k.postDelayed(a.m, 200L);
        }
    }

    public void t() {
        class com.iab.omid.library.unity3d.walking.a.c implements Runnable {
            final a a;

            @Override
            public void run() {
                a.this.g.c();
            }
        }

        this.p();
        this.a.clear();
        a.j.post(new com.iab.omid.library.unity3d.walking.a.c(this));
    }

    private void u() {
        Handler handler0 = a.k;
        if(handler0 != null) {
            handler0.removeCallbacks(a.m);
            a.k = null;
        }
    }

    private void v() {
        this.n();
        this.o();
        this.m();
    }

    public void w(b a$b0) {
        if(this.a.contains(a$b0)) {
            this.a.remove(a$b0);
        }
    }
}

