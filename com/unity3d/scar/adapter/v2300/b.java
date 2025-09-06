package com.unity3d.scar.adapter.v2300;

import R2.a;
import android.content.Context;
import android.widget.RelativeLayout;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.scar.adapter.common.g;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.scar.adapter.common.i;
import com.unity3d.scar.adapter.common.l;
import com.unity3d.scar.adapter.common.m;
import com.unity3d.scar.adapter.v2300.scarads.e;

public class b extends l implements f {
    private a e;

    public b(d d0, String s) {
        super(d0);
        a a0 = new a(new O2.a(s));
        this.e = a0;
        this.a = new com.unity3d.scar.adapter.v2300.signals.b(a0);
    }

    @Override  // com.unity3d.scar.adapter.common.f
    public void e(Context context0, RelativeLayout relativeLayout0, P2.d d0, int v, int v1, g g0) {
        class c implements Runnable {
            final com.unity3d.scar.adapter.v2300.scarads.c a;
            final b b;

            c(com.unity3d.scar.adapter.v2300.scarads.c c0) {
                this.a = c0;
                super();
            }

            @Override
            public void run() {
                this.a.b(null);
            }
        }

        m.a(new c(this, new com.unity3d.scar.adapter.v2300.scarads.c(context0, relativeLayout0, this.e, d0, v, v1, this.d, g0)));
    }

    @Override  // com.unity3d.scar.adapter.common.f
    public void f(Context context0, P2.d d0, h h0) {
        class com.unity3d.scar.adapter.v2300.b.a implements Runnable {
            final e a;
            final P2.d b;
            final b c;

            com.unity3d.scar.adapter.v2300.b.a(e e0, P2.d d0) {
                this.a = e0;
                this.b = d0;
                super();
            }

            @Override
            public void run() {
                class com.unity3d.scar.adapter.v2300.b.a.a implements P2.c {
                    final com.unity3d.scar.adapter.v2300.b.a a;

                    @Override  // P2.c
                    public void onAdLoaded() {
                        b.this.b.put(com.unity3d.scar.adapter.v2300.b.a.this.b.c(), com.unity3d.scar.adapter.v2300.b.a.this.a);
                    }
                }

                com.unity3d.scar.adapter.v2300.b.a.a b$a$a0 = new com.unity3d.scar.adapter.v2300.b.a.a(this);
                this.a.b(b$a$a0);
            }
        }

        m.a(new com.unity3d.scar.adapter.v2300.b.a(this, new e(context0, this.e, d0, this.d, h0), d0));
    }

    @Override  // com.unity3d.scar.adapter.common.f
    public void g(Context context0, P2.d d0, i i0) {
        class com.unity3d.scar.adapter.v2300.b.b implements Runnable {
            final com.unity3d.scar.adapter.v2300.scarads.g a;
            final P2.d b;
            final b c;

            com.unity3d.scar.adapter.v2300.b.b(com.unity3d.scar.adapter.v2300.scarads.g g0, P2.d d0) {
                this.a = g0;
                this.b = d0;
                super();
            }

            @Override
            public void run() {
                class com.unity3d.scar.adapter.v2300.b.b.a implements P2.c {
                    final com.unity3d.scar.adapter.v2300.b.b a;

                    @Override  // P2.c
                    public void onAdLoaded() {
                        b.this.b.put(com.unity3d.scar.adapter.v2300.b.b.this.b.c(), com.unity3d.scar.adapter.v2300.b.b.this.a);
                    }
                }

                com.unity3d.scar.adapter.v2300.b.b.a b$b$a0 = new com.unity3d.scar.adapter.v2300.b.b.a(this);
                this.a.b(b$b$a0);
            }
        }

        m.a(new com.unity3d.scar.adapter.v2300.b.b(this, new com.unity3d.scar.adapter.v2300.scarads.g(context0, this.e, d0, this.d, i0), d0));
    }
}

