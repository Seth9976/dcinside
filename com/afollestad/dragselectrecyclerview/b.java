package com.afollestad.dragselectrecyclerview;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.OnItemTouchListener;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.ranges.j;
import kotlin.ranges.s;
import y4.l;
import y4.m;

public final class b implements OnItemTouchListener {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final b a(@l Context context0, @l com.afollestad.dragselectrecyclerview.a a0, @m Function1 function10) {
            L.p(context0, "context");
            L.p(a0, "receiver");
            b b0 = new b(context0, a0, null);
            if(function10 != null) {
                function10.invoke(b0);
            }
            return b0;
        }

        public static b b(a b$a0, Context context0, com.afollestad.dragselectrecyclerview.a a0, Function1 function10, int v, Object object0) {
            if((v & 4) != 0) {
                function10 = null;
            }
            return b$a0.a(context0, a0, function10);
        }
    }

    @l
    private final com.afollestad.dragselectrecyclerview.a a;
    @l
    private final Handler b;
    @l
    private final com.afollestad.dragselectrecyclerview.b.b c;
    private int d;
    private int e;
    private int f;
    @m
    private Function1 g;
    @l
    private e h;
    @m
    private RecyclerView i;
    private int j;
    private int k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private boolean v;
    @l
    public static final a w = null;
    private static final int x = 25;

    static {
        b.w = new a(null);
    }

    private b(Context context0, com.afollestad.dragselectrecyclerview.a a0) {
        public static final class com.afollestad.dragselectrecyclerview.b.b implements Runnable {
            final b a;

            com.afollestad.dragselectrecyclerview.b.b(b b0) {
                this.a = b0;
                super();
            }

            @Override
            public void run() {
                if(this.a.s) {
                    RecyclerView recyclerView0 = this.a.i;
                    if(recyclerView0 != null) {
                        recyclerView0.scrollBy(0, -this.a.u);
                    }
                    this.a.b.postDelayed(this, 25L);
                    return;
                }
                if(this.a.t) {
                    RecyclerView recyclerView1 = this.a.i;
                    if(recyclerView1 != null) {
                        recyclerView1.scrollBy(0, this.a.u);
                    }
                    this.a.b.postDelayed(this, 25L);
                }
            }
        }

        this.a = a0;
        this.b = new Handler(Looper.getMainLooper());
        this.c = new com.afollestad.dragselectrecyclerview.b.b(this);
        this.d = d.a(context0, dimen.dsrv_defaultHotspotHeight);
        this.h = e.a;
        this.j = -1;
    }

    public b(Context context0, com.afollestad.dragselectrecyclerview.a a0, w w0) {
        this(context0, a0);
    }

    public final void f() {
        this.d = -1;
        this.e = -1;
        this.f = -1;
    }

    @m
    public final Function1 g() {
        return this.g;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    @RestrictTo({Scope.b})
    public void h(@l RecyclerView recyclerView0, @l MotionEvent motionEvent0) {
        L.p(recyclerView0, "view");
        L.p(motionEvent0, "event");
        int v = motionEvent0.getAction();
        int v1 = d.b(recyclerView0, motionEvent0);
        float f = motionEvent0.getY();
        switch(v) {
            case 1: {
                this.p();
                return;
            }
            case 2: {
                if(this.d > -1) {
                    if(f >= ((float)this.o) && f <= ((float)this.p)) {
                        this.t = false;
                        if(!this.s) {
                            this.s = true;
                            this.b.removeCallbacks(this.c);
                            this.b.postDelayed(this.c, 25L);
                            this.o(true);
                        }
                        this.u = ((int)(((float)(this.p - this.o)) - (f - ((float)this.o)))) / 2;
                    }
                    else if(f >= ((float)this.q) && f <= ((float)this.r)) {
                        this.s = false;
                        if(!this.t) {
                            this.t = true;
                            this.b.removeCallbacks(this.c);
                            this.b.postDelayed(this.c, 25L);
                            this.o(true);
                        }
                        this.u = ((int)(f + ((float)this.r) - ((float)(this.q + this.r)))) / 2;
                    }
                    else if(this.s || this.t) {
                        this.b.removeCallbacks(this.c);
                        this.o(false);
                        this.s = false;
                        this.t = false;
                    }
                }
                e e0 = this.h;
                if(e0 == e.b && v1 != -1) {
                    if(this.j == v1) {
                        return;
                    }
                    this.j = v1;
                    boolean z = this.a.c(v1);
                    this.a.a(v1, !z);
                    return;
                }
                if(e0 == e.a && v1 != -1 && this.j != v1) {
                    this.j = v1;
                    if(this.m == -1) {
                        this.m = v1;
                    }
                    if(this.n == -1) {
                        this.n = v1;
                    }
                    if(v1 > this.n) {
                        this.n = v1;
                    }
                    if(v1 < this.m) {
                        this.m = v1;
                    }
                    this.q(this.k, v1, this.m, this.n);
                    int v2 = this.j;
                    if(this.k == v2) {
                        this.m = v2;
                        this.n = v2;
                    }
                }
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    @RestrictTo({Scope.b})
    public boolean i(@l RecyclerView recyclerView0, @l MotionEvent motionEvent0) {
        L.p(recyclerView0, "view");
        L.p(motionEvent0, "event");
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        boolean z = recyclerView$Adapter0 == null ? true : d.c(recyclerView$Adapter0);
        boolean z1 = this.l && !z;
        if(z1) {
            this.i = recyclerView0;
            int v = this.d;
            if(v > -1) {
                this.o = this.e;
                this.p = this.e + v;
                this.q = recyclerView0.getMeasuredHeight() - this.d - this.f;
                this.r = recyclerView0.getMeasuredHeight() - this.f;
            }
        }
        if(z1 && motionEvent0.getAction() == 1) {
            this.p();
        }
        return z1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    @RestrictTo({Scope.b})
    public void j(boolean z) {
    }

    public final int k() {
        return this.d;
    }

    public final int l() {
        return this.f;
    }

    public final int m() {
        return this.e;
    }

    @l
    public final e n() {
        return this.h;
    }

    private final void o(boolean z) {
        if(this.v == z) {
            return;
        }
        this.v = z;
        Function1 function10 = this.g;
        if(function10 != null) {
            function10.invoke(Boolean.valueOf(z));
        }
    }

    private final void p() {
        this.l = false;
        this.s = false;
        this.t = false;
        this.b.removeCallbacks(this.c);
        this.o(false);
    }

    private final void q(int v, int v1, int v2, int v3) {
        com.afollestad.dragselectrecyclerview.a a0 = this.a;
        if(v == v1) {
            if(v2 <= v3) {
                while(true) {
                    if(v2 != v) {
                        a0.a(v2, false);
                    }
                    if(v2 == v3) {
                        break;
                    }
                    ++v2;
                }
            }
            return;
        }
        if(v1 < v) {
            j j0 = s.q1(new kotlin.ranges.l(v1, v));
            int v4 = j0.g();
            int v5 = j0.h();
            int v6 = j0.i();
            if(v6 > 0 && v4 <= v5 || v6 < 0 && v5 <= v4) {
                while(true) {
                    a0.a(v4, true);
                    if(v4 == v5) {
                        break;
                    }
                    v4 += v6;
                }
            }
            if(v2 > -1 && v2 < v1) {
                while(v2 < v1) {
                    a0.a(v2, false);
                    ++v2;
                }
            }
            if(v3 > -1) {
                int v7 = v + 1;
                if(v7 <= v3) {
                    while(true) {
                        a0.a(v7, false);
                        if(v7 == v3) {
                            break;
                        }
                        ++v7;
                    }
                }
            }
        }
        else {
            if(v <= v1) {
                for(int v8 = v; true; ++v8) {
                    a0.a(v8, true);
                    if(v8 == v1) {
                        break;
                    }
                }
            }
            if(v3 > -1 && v3 > v1) {
                int v9 = v1 + 1;
                if(v9 <= v3) {
                    while(true) {
                        a0.a(v9, false);
                        if(v9 == v3) {
                            break;
                        }
                        ++v9;
                    }
                }
            }
            if(v2 > -1) {
                while(v2 < v) {
                    a0.a(v2, false);
                    ++v2;
                }
            }
        }
    }

    public final void r(@m Function1 function10) {
        this.g = function10;
    }

    public final void s(int v) {
        this.d = v;
    }

    public final void t(int v) {
        this.f = v;
    }

    public final void u(int v) {
        this.e = v;
    }

    public final boolean v(boolean z, int v) {
        if(z && this.l) {
            return false;
        }
        this.j = -1;
        this.m = -1;
        this.n = -1;
        this.b.removeCallbacks(this.c);
        this.o(false);
        this.s = false;
        this.t = false;
        if(!z) {
            this.k = -1;
            return false;
        }
        if(!this.a.b(v)) {
            this.l = false;
            this.k = -1;
            return false;
        }
        this.a.a(v, true);
        this.l = true;
        this.k = v;
        this.j = v;
        return true;
    }

    public final void w(@l e e0) {
        L.p(e0, "mode");
        this.h = e0;
        this.v(false, -1);
    }
}

